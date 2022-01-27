const commandLineArgs = require("command-line-args")
const fs = require("fs-extra")
const stable = require("stable")
const cheerio = require("cheerio")
const _ = require("underscore")
const imagemin = require("imagemin")
const imageminOptipng = require("imagemin-optipng")
const download = require("download")
const immutable = require("immutable")

Array.prototype.nestedLength = function flatten() {
  return this.reduce((sum, toSum) => sum + toSum.length, 0)
}

Array.prototype.flatten = function flatten() {
  return this.reduce((flat, toFlatten) => flat.concat(Array.isArray(toFlatten) ? toFlatten.flatten() : toFlatten), [])
}

String.prototype.capitalize = function () {
  return this.charAt(0).toUpperCase() + this.slice(1)
}

function getCodePointForFindingInfo(row) {
  return row.children[0].attribs.name.replace(/_/g, "-")
}

function generateEmojiCode(target, emojis, indent = 6) {
  let indentString = ""

  for (let i = 0; i < indent; i++) {
    indentString += " "
  }

  return emojis.filter(it => it[target.package] && !target.ignore.includes(it.unicode)).map((it) => {
    const unicodeParts = it.unicode.split("_")
    let result = ""

    if (unicodeParts.length === 1) {
      result = `Emoji(0x${unicodeParts[0]}, R.drawable.emoji_${target.package}_${it.unicode}`
    } else {
      result = `Emoji(intArrayOf(${unicodeParts.map(it => "0x" + it).join(", ")}), R.drawable.emoji_${target.package}_${it.unicode}`
    }

    if (it.variants.filter(it => it[target.package]).length > 0) {
      return `${result}, arrayOf(\n${indentString}  ${generateEmojiCode(target, it.variants, indent + 2)}\n${indentString}))`
    } else {
      return `${result})`
    }
  }).join(`,\n${indentString}`)
}

function generateGoogleCompatEmojiCode(target, emojis, indent = 6) {
  let indentString = ""

  for (let i = 0; i < indent; i++) {
    indentString += " "
  }

  return emojis.filter(it => it[target.package] && !target.ignore.includes(it.unicode)).map((it) => {
    const unicodeParts = it.unicode.split("_")
    let result = ""

    if (unicodeParts.length === 1) {
      result = `GoogleCompatEmoji(0x${unicodeParts[0]}`
    } else {
      result = `GoogleCompatEmoji(intArrayOf(${unicodeParts.map(it => "0x" + it).join(", ")})`
    }

    if (it.variants.filter(it => it[target.package]).length > 0) {
      return `${result}, arrayOf(\n${indentString}  ${generateGoogleCompatEmojiCode(target, it.variants, indent + 2)}\n${indentString}))`
    } else {
      return `${result})`
    }
  }).join(`,\n${indentString}`)
}

async function optimizeEmojiImage(target, emoji) {
  if (emoji[target.package] && !target.ignore.includes(emoji.unicode)) {
    emoji[target.package] = await imagemin.buffer(emoji[target.package], {
      plugins: [
        imageminOptipng({more: true})
      ]
    })

    for (const variant of emoji.variants) {
      await optimizeEmojiImage(target, variant)
    }
  }
}

async function copyEmojiImage(target, emoji) {
  if (emoji[target.package] && !target.ignore.includes(emoji.unicode)) {
    await fs.writeFile(`../emoji-${target.package}/src/main/res/drawable-nodpi/emoji_${target.package}_${emoji.unicode}.png`, emoji[target.package])

    for (const variant of emoji.variants) {
      await copyEmojiImage(target, variant)
    }
  }
}
// TODO: check and clear ignore
const targets = [{
  package: "ios",
  name: "IosEmoji",
  imagePosition: 3,
  ignore: [
    // Some duplicate flags, especially for this target.
    "1f1eb_1f1f7",
    "1f1f3_1f1f4",
    "1f1f8_1f1ed"
  ]
}, {
  package: "google",
  name: "GoogleEmoji",
  imagePosition: 4,
  ignore: [
    // Some invalid "?"-icons, especially for this target.
    "1f1e7_1f1f1",
    "1f1e7_1f1f6",
    "1f1e9_1f1ec",
    "1f1ea_1f1e6",
    "1f1ea_1f1ed",
    "1f1eb_1f1f0",
    "1f1ec_1f1eb",
    "1f1ec_1f1f5",
    "1f1ec_1f1f8",
    "1f1f2_1f1eb",
    "1f1f2_1f1f6",
    "1f1f3_1f1e8",
    "1f1f5_1f1f2",
    "1f1f7_1f1ea",
    "1f1f9_1f1eb",
    "1f1fc_1f1eb",
    "1f1fd_1f1f0",
    "1f1fe_1f1f9",
    "1f1e8_1f1f5",
    "1f1e6_1f1fa",
    "1f1e7_1f1fb",
    "1f1fa_1f1f2",
    "1f1f3_1f1f4"
  ]
},{
  package: "facebook",
  name: "FacebookEmoji",
  imagePosition: 5,
  ignore: [
    // Some duplicate flags, especially for this target.
  ]
},{
  package: "windows",
  name: "WindowsEmoji",
  imagePosition: 6,
  ignore: [
    // Some duplicate flags, especially for this target.
  ]
}, {
  package: "twitter",
  name: "TwitterEmoji",
  imagePosition: 7,
  ignore: [
    // Some duplicate flags, especially for this target.
    "1f1eb_1f1f7"
  ]
}, {
  package: "one",
  name: "EmojiOne",
  imagePosition: 8,
  ignore: [
    // Some duplicate flags, especially for this target.
    "1f1f2_1f1e8",
    "1f1f3_1f1f4",
    "1f1f9_1f1e9"
  ]
},{
  package: "samsung",
  name: "SamsungEmoji",
  imagePosition: 9,
  ignore: [
    // Some duplicate flags, especially for this target.
  ]
}]

const ignore = [
  "1f1ea_1f1f8", "1f1ed_1f1f2", "1f1ee_1f1f4", "1f1f2_1f1eb", "1f1f8_1f1ef", "1f1f9_1f1e6",
  "1f1fa_1f1f8"
]

async function downloadFile(url, dest) {
  await download(url, dest)
    .on('response', res => {
      let current = 0

      res.on('data', data => {
        current += data.length

        process.stdout.write("\r" + parseFloat(current / 1024 / 1024).toFixed(2) + "MB")
      })
    })

  console.log("")
}

async function downloadFiles() {
  console.log("Downloading files...")

  await fs.emptyDir("build")
  await downloadFile("https://unicode.org/emoji/charts/full-emoji-list.html", "build")
  await downloadFile("https://unicode.org/emoji/charts/full-emoji-modifiers.html", "build")
  await downloadFile("https://raw.githubusercontent.com/joypixels/emoji-toolkit/master/emoji.json", "build")

  await downloadFile("https://raw.githubusercontent.com/joypixels/emoji-toolkit/master/categories.json", "build")
}

async function getTrAndFilter(input) {
  const emojiInfo = Object.values(JSON.parse(await fs.readFile("build/emoji.json")))
  return input("tr").get()
    .map(it => it.children.filter(it => it.name === "td"))
    .filter(it => it.length === 15 && it[1].attribs.class === "code")
    .filter(it => {
      const presentInInfo = emojiInfo.find(info => info.code_points.base === getCodePointForFindingInfo(it[1]) || info.code_points.fully_qualified === getCodePointForFindingInfo(it[1]))

      if (!presentInInfo) {
        if (it[it.length - 1].children !== undefined) {
          console.error(`Not found in emoji.json: ${it[it.length - 1].children[0].data}`)
        } else {
          console.error(`Not found in emoji.json: ${getCodePointForFindingInfo(it[1])}`)
        }
      }

      return presentInInfo
    })
}

async function parse() {
  console.log("Parsing files...")

  const map = new Map()
  const emojiInfo = Object.values(JSON.parse(await fs.readFile("build/emoji.json")))

  const emojiList$ = cheerio.load(await fs.readFile("build/full-emoji-list.html"))
  const emojiList = await getTrAndFilter(emojiList$)

  const emojiModifiers$ = cheerio.load(await fs.readFile("build/full-emoji-modifiers.html"))
  const emojiModifiers = await getTrAndFilter(emojiModifiers$)

  const rows = immutable.merge(emojiList, emojiModifiers)

  const sortedRows = stable(rows, (first, second) => {
    return emojiInfo.find(it => it.code_points.base === getCodePointForFindingInfo(first[1]) || it.code_points.fully_qualified === getCodePointForFindingInfo(first[1])).order -
      emojiInfo.find(it => it.code_points.base === getCodePointForFindingInfo(second[1]) || it.code_points.fully_qualified === getCodePointForFindingInfo(second[1])).order
  })

  for (const row of sortedRows) {
    const info = emojiInfo.find(it => it.code_points.base === getCodePointForFindingInfo(row[1]) || it.code_points.fully_qualified === getCodePointForFindingInfo(row[1]))
    const category = info.category

    if (info.display === 0) {
      // This is a duplicate.
      continue
    }

    const code = row[1].children[0].attribs.name
    const name = row[row.length - 1].children[0].data
    const isVariant = name.includes("skin tone")

    if (ignore.includes(code)) {
      continue
    }

    const emoji = {
      unicode: code,
      name: name,
      variants: []
    }

    for (const target of targets) {
      const image = row[target.imagePosition].children[0].name === "img" ?
        new Buffer(row[target.imagePosition].children[0].attribs.src.replace(/^data:image\/png;base64,/, ""), "base64") : null

      if (image) {
        emoji[target.package] = image
      }
    }

    if (isVariant && map.get(category) !== undefined) {
      const array = map.get(category)
      const base = array.find(it => it.name === name.substring(0, name.indexOf(":")))

      if (base) {
        base.variants.push(emoji)
      } else {
        console.error(`Base not found for variant: ${name}`)
      }
    } else {
      if (map.has(category)) {
        map.get(category).push(emoji)
      } else {
        map.set(category, new Array(emoji))
      }
    }
  }

  const categoryInfo = Object.values(JSON.parse(await fs.readFile("build/categories.json")))

  let categoryOrderList = categoryInfo.map(c => c.category)

  let newValues = new Map()
  let keys = [...map.keys()]
  let values = [...map.entries()]

  categoryOrderList.forEach((value, index) => {
    keys.forEach((key, keyIndex) => {
      if (value === key) {
        newValues.set(value, values[keyIndex][1])
      }
    })
  })

  return newValues
}

async function optimizeImages(map, targets) {
  console.log("Optimizing images...")

  const emojiAmount = [...map.values()].nestedLength()
  let i = 0

  for (const emoji of [...map.values()].flatten()) {
    process.stdout.write("\r" + (i + 1) + "/" + emojiAmount)

    for (const target of targets) {
      await optimizeEmojiImage(target, emoji)
    }

    i++
  }

  console.log("")
}

async function copyImages(map, targets) {
  console.log("Copying images...")

  for (const target of targets) {
    await fs.emptyDir(`../emoji-${target.package}/src/main/res/drawable-nodpi`)
  }

  const emojiAmount = [...map.values()].nestedLength()
  let i = 0

  const selectorTemplate = await fs.readFile("template/selector.xml", "utf-8")

  for (const [category, emojis] of map) {
    for (const target of targets) {
      // normal
      await fs.copy(`img/${category}.png`,
        `../emoji-${target.package}/src/main/res/drawable-nodpi/emoji_${target.package}_category_${category}_normal.png`)
      // focus
      await fs.copy(`img/${category}_focus.png`,
        `../emoji-${target.package}/src/main/res/drawable-nodpi/emoji_${target.package}_category_${category}_focus.png`)
      // selector
      await fs.writeFile(`../emoji-${target.package}/src/main/res/drawable-nodpi/emoji_${target.package}_category_${category}.xml`,
        _(selectorTemplate).template()({
          focus: `emoji_${target.package}_category_${category}_focus`,
          normal: `emoji_${target.package}_category_${category}_normal`
        }))
    }

    for (const emoji of emojis) {
      process.stdout.write("\r" + (i + 1) + "/" + emojiAmount)

      for (const target of targets) {
        await copyEmojiImage(target, emoji)
      }

      i++
    }
  }

  console.log("")
}

async function generateCode(map, targets) {
  console.log("Generating java code...")

  const categoryTemplate = await fs.readFile("template/Category.kt", "utf-8")
  const emojiProviderTemplate = await fs.readFile("template/EmojiProvider.kt", "utf-8")

  for (const target of targets) {
    const dir = `../emoji-${target.package}/src/main/java/dev/leonardpark/emoji/${target.package}/category/`

    await fs.emptyDir(dir)

    for (const [category, emojis] of map.entries()) {
      const data = generateEmojiCode(target, emojis)

      await fs.writeFile(`${dir + category.capitalize()}Category.kt`,
        _(categoryTemplate).template()({
          package: target.package,
          name: category.capitalize(),
          data: data,
          icon: category,
          imports: ""
        }))
    }

    const imports = [...map.keys()].sort().map((category) => {
      return `import dev.leonardpark.emoji.${target.package}.category.${category.capitalize()}Category;`
    }).join("\n")

    const categoryMapping = [...map.keys()].map((category) => {
      return `${category.capitalize()}Category()`
    }).join(",\n    ")

    //
    await fs.writeFile(`../emoji-${target.package}/src/main/java/dev/leonardpark/emoji/${target.package}/${target.name}Provider.kt`, _(emojiProviderTemplate).template()({
      package: target.package,
      imports: imports,
      name: target.name,
      categoryMapping: categoryMapping
    }))
  }

  // for google compact
  const compatDir = `../emoji-google-compat/src/main/java/dev/leonardpark/emoji/googlecompat/category/`

  for (const [category, emojis] of map.entries()) {
    const data = generateGoogleCompatEmojiCode(targets[1], emojis)

    await fs.writeFile(`${compatDir + category.capitalize()}Category.kt`,
      _(categoryTemplate).template()({
        package: 'googlecompat',
        name: category.capitalize(),
        data: data,
        icon: category,
        imports: "import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji\n"
      }))
  }
}

async function run() {
  const options = commandLineArgs([
    {name: 'no-download', type: Boolean},
    {name: 'no-copy', type: Boolean},
    {name: 'no-optimize', type: Boolean},
    {name: 'no-generate', type: Boolean}
  ])

  if (!options["no-download"]) {
    await downloadFiles()
  }

  const map = await parse()

  if (!options["no-copy"]) {
    if (!options["no-optimize"]) {
      await optimizeImages(map, targets)
    }

    await copyImages(map, targets)
  }

  if (!options["no-generate"]) {
    await generateCode(map, targets)
  }
}

run().then()
  .catch(err => {
    console.error(err)
  })
