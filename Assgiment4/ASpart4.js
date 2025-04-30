Task 4
const obj = {
  z: 1,
  a: 2,
  10: 3,
  b: 4,
  2: 5,
  c: 6
};

for (const key in obj) {
  console.log(key, obj[key]);
}

console.log(Object.keys(obj));

Part 5 Task 3

for (let i = 1; i <= 20; i++) {
  if (i % 5 === 0) {
    continue;
  }
  if (i > 15) {
    break;
  }
  console.log(i);
}


Task 4

const numbers = [10, 5, 8, 20, 3, 15, 25];

for (const num of numbers) {
  if (num > 12) {
    console.log("Found a large number!");
    break;
  }
  if (num === 5) {
    console.log("Skipping 5!");
    continue;
  }
  console.log(num);
}


