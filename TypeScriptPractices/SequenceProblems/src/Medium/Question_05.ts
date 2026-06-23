import promptSync from "prompt-sync";

const prompt = promptSync();

let str: string = prompt("Enter a string: ");

console.log(str.length);
console.log(str + str);
console.log(str[0]);
console.log(str.substring(0, 3));