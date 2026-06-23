import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let weight: number = Number(lines[0]);
let height: number = Number(lines[1]);

let bmi: number = weight / (height * height);

console.log("BMI: " + bmi.toFixed(2));