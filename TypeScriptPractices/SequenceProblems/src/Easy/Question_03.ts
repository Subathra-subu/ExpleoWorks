import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let number1: number = Number(lines[0]);
let number2: number = Number(lines[1]);

console.log(`Sum of ${number1} and ${number2}: ${number1 + number2}`);