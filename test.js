let fruits = ['mangos', 'banana', 'guavas', 'oranges', 'avocado', 'muskmelon'];

fruits.filter(x => x.startsWith('m'))
.map(x => x.concat(" Tastes so goood"))
.forEach(x => console.log(x));

let calculate =(a, b) => a + b;
console.log(calculate(5, 10));


let numbers = [1,2,3,4,5,6,7,8];
let evenNumbers = numbers.filter(n => n % 2 === 0);  //2,4,6,8
let evenNumbersSquared = evenNumbers.map(n => n * n);

// Chain the methods

console.log(evenNumbersSquared)