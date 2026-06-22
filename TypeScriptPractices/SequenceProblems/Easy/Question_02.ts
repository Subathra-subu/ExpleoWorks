import promptSync from "prompt-sync"

const prompt = promptSync();

let radius: number = Number(prompt("Enter the radius: "));

let area: number = Math.PI * radius * radius;

console.log("Area of Circle =", area);