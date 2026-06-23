import * as fs from "fs";

const lines = fs.readFileSync("input_sequence.txt", "utf8").split(/\r?\n/);

let name: string = lines[0] || "";

console.log("Hello, " + name + "!");