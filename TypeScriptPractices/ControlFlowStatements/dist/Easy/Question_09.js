import PromptSync from "prompt-sync";
const prompt = PromptSync();
let num = Number(prompt("Enter the number:"));
let sum = 0;
let digit = 0;
while (num > 0) {
    digit = num % 10;
    sum += digit;
    num = Math.trunc(num / 10);
}
console.log("Sum of Digits:" + sum);
//# sourceMappingURL=Question_09.js.map