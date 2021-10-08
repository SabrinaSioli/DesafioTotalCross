//Extracting Words with "-ing" Inflection
//https://edabit.com/challenge/XiHt35Amfnci2pLgr
function ingExtractor(string) {
    /*
      First, I separated the string into a array using the 'split(" ")'
      then I used 'filter' to crated an array that's:
      - contains only words biggers than 4 (that way words like 'sing' will not pass the test )
      - and words with the final 'ing'.
     */
  return string.split(" ").filter((word) => {
    return word.length > 4 && word.endsWith("ing")
  })
}

//Tests
console.log(ingExtractor("coming bringing Letting sing"))
console.log(ingExtractor("going Ping, king sHrink dOing"))
console.log(ingExtractor("zing went ring, ding wing SINk"))