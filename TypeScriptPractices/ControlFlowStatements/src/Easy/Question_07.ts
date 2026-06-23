import PromptSync from "prompt-sync";
const prompt = PromptSync();

let age:number = Number(prompt("Enter the age:"));
let weight:number = Number(prompt("Enter the weight:"));

if(age > 18 && age < 55 && weight > 45){
    console.log("The donar is eligible to donate blood");
}
else{
    console.log("The donar is not eligible to donate blood");
}
