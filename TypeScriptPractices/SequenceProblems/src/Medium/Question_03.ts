import promptSync from "prompt-sync";

const prompt = promptSync();

let rating: number = Number(prompt("Average Rating: "));
let avgrating: number = Math.round(rating);

console.log("Rounded Rating: " + avgrating);