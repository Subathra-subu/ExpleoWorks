import PromptSync from "prompt-sync";
const prompt = PromptSync();
let employee_name = prompt("Enter the employee name:");
let wages = Number(prompt("Enter the wages of the employee:"));
let days_worked = Number(prompt("Enter the number of days worked:"));
let total_salary = wages * days_worked;
console.log(`The total salary of the employee ${employee_name} is ${total_salary}`);
//# sourceMappingURL=Question_01.js.map