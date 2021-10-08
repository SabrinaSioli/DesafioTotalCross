function ingExtractor(string) {
	const result = string.split(" ")
  return result.filter((word) => {
    return word.length > 4 && word.endsWith("ing")
  })
}

console.log(ingExtractor("coming bringing Letting sing"))
console.log(ingExtractor("going Ping, king sHrink dOing"))
console.log(ingExtractor("zing went ring, ding wing SINk"))