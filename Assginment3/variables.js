// Global Scope
let globalVar = "I am global";

console.log("Global Scope:");
console.log(globalVar); // Accessible

// Function (Local) Scope
function localScopeExample() {
  let localVar = "I am local to localScopeExample";
  console.log("\nFunction Scope:");
  console.log(localVar); //  Accessible inside the function

  // Shadowing global variable
  let globalVar = "I am shadowing the global variable";
  console.log("Shadowed globalVar inside function:", globalVar); // Bob
}

localScopeExample();

// console.log(localVar); // Error: localVar is not defined
console.log("Accessing globalVar outside function:", globalVar); // Still "I am global"

//Block Scope (let, const vs var)
console.log("\nBlock Scope:");
if (true) {
  let blockLet = "I am block-scoped (let)";
  const blockConst = "I am block-scoped (const)";
  var blockVar = "I am NOT block-scoped (var)";

  console.log(blockLet);     // 
  console.log(blockConst);   // 
}
// console.log(blockLet);   / ReferenceError
// console.log(blockConst); / ReferenceError
console.log(blockVar);    // Accessible because var is not block-scoped

// Hoisting with var
console.log("\nHoisting Example:");
function hoistingExample() {
  console.log(hoistedVar); // undefined due to hoisting
  var hoistedVar = "I was hoisted";
}
hoistingExample();
