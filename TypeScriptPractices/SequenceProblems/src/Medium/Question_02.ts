import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let score: string = lines[0] || " ";

console.log("Your score is " + score + ".");