Task 1

setTimeout(function() {
  console.log(`Hello, ${this.name}`);
}, 1000);


Task 2

const self = this;
setTimeout(function() {
  console.log(self.name);
}, 1000);


Task 3

setTimeout(() => {
  console.log(this.name);
}, 1000);


Task 4


const carFixed = {
  brand: 'Toyota',
  announce: function() {
    setTimeout(() => {
      console.log(`Brand is ${this.brand}`); 
    }, 1000);
  }
};
carFixed.announce(); 