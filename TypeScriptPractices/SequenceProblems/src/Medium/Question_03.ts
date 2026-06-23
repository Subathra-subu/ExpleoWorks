import * as fs from "fs";

const lines = fs.readFileSync("Input.txt", "utf8").split(/\r?\n/);

let rating: number = Number(lines[0]);
let avgRating: number = Math.round(rating);

console.log("Rounded Rating: " + avgRating);