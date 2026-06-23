import PromptSync from "prompt-sync";
const prompt = PromptSync();
let num = Number(prompt("Enter the number:"));
for (let i = 1; i <= num; i++) {
    for (let j = 1; j <= i; j++) {
        process.stdout.write(i.toString() + " ");
    }
    console.log();
}
//# sourceMappingURL=Question_10.js.map