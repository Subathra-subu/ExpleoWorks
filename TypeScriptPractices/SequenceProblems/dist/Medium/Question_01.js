import promptSync from "prompt-sync";
const prompt = promptSync();
let weight = Number(prompt("Weight: "));
let height = Number(prompt("Height: "));
let bmi = weight / (height * height);
console.log("BMI: " + bmi.toFixed(2));
//# sourceMappingURL=Question_01.js.map