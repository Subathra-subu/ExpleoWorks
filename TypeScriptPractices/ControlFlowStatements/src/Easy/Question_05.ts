import PromptSync from "prompt-sync";
const prompt = PromptSync();

for (let i:number=97,j:number=122; i<=122;i++,j--){
    console.log(`${String.fromCharCode(i)}${String.fromCharCode(j)}`);
}