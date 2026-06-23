import promptSync from "prompt-sync";
const prompt = promptSync();
let input = prompt("Enter a list of product names separated by commas: ");
let products = input.split(",");
console.log("List of Products:");
for (let i = 0; i < products.length; i++) {
    console.log(products[i]);
}
//# sourceMappingURL=Question_04.js.map