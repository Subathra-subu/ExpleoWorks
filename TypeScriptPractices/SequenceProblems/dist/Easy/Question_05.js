import promptSync from "prompt-sync";
const prompt = promptSync();
let birth = Number(prompt("Enter your birth year: "));
let current = new Date().getFullYear();
let age = current - birth;
console.log("Your age is: " + age + "years");
//# sourceMappingURL=Question_05.js.map