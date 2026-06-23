import PromptSync from "prompt-sync";
const prompt = PromptSync();

let num:number=Number(prompt("Enter the number:"));

for (let i:number=1;i<=num;i++){
    for(let j=1;j<=i;j++){
        process.stdout.write(i.toString()+" ");
    }
    console.log();
}