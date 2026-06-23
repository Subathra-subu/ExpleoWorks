import PromptSync from "prompt-sync";
const prompt = PromptSync();

let num:number = Number(prompt("Enter number:"));
let sum:number=0;
while(num > 0){
    let count:number = 1;
    while (num >= count && count != 0){
        console.log("Hello");
        count++;
    }
    sum+=num
    num = Number(prompt("Enter number:"));
}
console.log(sum);
