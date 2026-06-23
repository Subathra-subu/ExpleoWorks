import PromptSync from "prompt-sync";
const prompt = PromptSync();
let num = Number(prompt("Enter the number:"));
let sum = 0;
let i = 0;
do {
    sum += i;
    i++;
} while (i <= num);
console.log(`Sum of the number: ${sum}`);
//# sourceMappingURL=Question_04.js.map