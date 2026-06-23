import PromptSync from "prompt-sync";
const prompt = PromptSync();
let num = Number(prompt("Enter number:"));
let sum = 0;
while (num > 0) {
    let count = 1;
    while (num >= count && count != 0) {
        console.log("Hello");
        count++;
    }
    sum += num;
    num = Number(prompt("Enter number:"));
}
console.log(sum);
//# sourceMappingURL=Question_06.js.map