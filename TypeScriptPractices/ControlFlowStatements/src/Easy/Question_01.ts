import PromptSync from "prompt-sync";
const prompt = PromptSync();

let employee_name : String = prompt("Enter the employee name:");
let wages : number = Number(prompt("Enter the wages of the employee:"));
let days_worked : number = Number(prompt("Enter the number of days worked:"));

let total_salary:Number = wages*days_worked;

console.log(`The total salary of the employee ${employee_name} is ${total_salary}`);