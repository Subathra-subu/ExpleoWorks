import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let birth: number = Number(lines[0]);
let current: number = new Date().getFullYear();
let age: number = current - birth;

console.log("Your age is: " + age + " years");