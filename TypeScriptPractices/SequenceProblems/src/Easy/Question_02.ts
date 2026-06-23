import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let radius: number = Number(lines[0]);
let area: number = Math.PI * radius * radius;

console.log("Area of Circle = " + area);