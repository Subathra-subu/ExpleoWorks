import promptSync from "prompt-sync";
const prompt = promptSync();
let rating = Number(prompt("Average Rating: "));
let avgrating = Math.round(rating);
console.log("Rounded Rating: " + avgrating);
//# sourceMappingURL=Question_03.js.map