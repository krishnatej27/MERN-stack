function createCalculator(){
  return {
    add: function(a,b){return a+b;},
    sub: function(a,b){return a-b;},
    mul: function(a,b){return a*b;},
    div: function(a,b){
      if(b===0) return "divide by 0 error";
      return a/b;
  }
};
}
const cal=createCalculator();
console.log(cal.add(1,2));
console.log(cal.sub(1,2));
console.log(cal.mul(1,2));
console.log(cal.div(1,2));
