// console.log(mysteryVariable); // Commented out
let mysteryVariable = 10;
console.log(mysteryVariable);

function revealMystery() {
  console.log("Inside revealMystery:", mysteryVariable);
  let mysteryVariable = 20;
  console.log("Inside revealMystery (after declaration):", mysteryVariable);
}




