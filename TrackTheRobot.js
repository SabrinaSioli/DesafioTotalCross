// Track the Robot (Part 2)
//Link: https://edabit.com/challenge/jfpfpH6w42tZeRo2T
function trackRobot(...steps) {
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

console.log(trackRobot(20, 30, 10, 40))
console.log(trackRobot())
console.log(trackRobot(-10, 20, 10))