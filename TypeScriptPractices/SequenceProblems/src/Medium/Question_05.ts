import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let str: string = lines[0] || " ";

console.log(str.length);
console.log(str + str);
console.log(str[0]);
console.log(str.substring(0, 3));