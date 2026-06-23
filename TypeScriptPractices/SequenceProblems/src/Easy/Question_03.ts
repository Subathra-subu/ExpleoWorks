import promptSync from "prompt-sync"

const prompt = promptSync();

let number1: number = Number(prompt("Enter the number1: "));

let number2: number = Number(prompt("Enter the number2: "));

console.log(`Sum of ${number1} and ${number2}: ${number1+number2}`);

