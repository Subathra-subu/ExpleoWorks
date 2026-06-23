import PromptSync from "prompt-sync";
const prompt = PromptSync();

let num:number = Number(prompt("Enter the number:"));

let sum:number=0;
let i:number=0;

do{
    sum+=i;
    i++;
}while(i<=num);

console.log(`Sum of the number: ${sum}`);