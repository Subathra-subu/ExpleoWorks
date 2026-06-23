import PromptSync from "prompt-sync";
const prompt = PromptSync();

let num:number = Number(prompt("Enter the number:"));
let sum:number = 0;
let digit:number = 0;
while(num > 0){
    digit = num%10;
    sum+=digit;
    num=Math.trunc(num/10);
}
console.log("Sum of Digits:"+sum);