// Track the Robot (Part 2)
//Link: https://edabit.com/challenge/jfpfpH6w42tZeRo2T
function trackRobot(...steps) {
  /**
   Basically I'm going to go through the whole array, I'm going to generate a 'step'
   that has the i%4 (since I have 4 possible directions). I test each of the possibilities 
   and add in the correct position of the 'pos' array, as shown in the example on the site. 
   */
	var pos = [0,0]
  for (i in steps) { 
    var step = i % 4
    if(step==0) pos[1] += steps[i]
    if(step==1) pos[0] += steps[i]
    if(step==2) pos[1] -= steps[i]
    if(step==3) pos[0] -= steps[i]
  }
  return pos
}

//tests
console.log(trackRobot(20, 30, 10, 40))
console.log(trackRobot())
console.log(trackRobot(-10, 20, 10))