import * as fs from "fs";

const lines = fs.readFileSync("Input.txt", "utf8").split(/\r?\n/);

let input: string = lines[0] || " ";
let products: string[] = input.split(",");

console.log("List of Products:");

for (let i = 0; i < products.length; i++) {
    console.log(products[i]);
}