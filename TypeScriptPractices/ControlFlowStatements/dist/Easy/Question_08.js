import PromptSync from "prompt-sync";
const prompt = PromptSync();
let character = prompt("Enter the Character:");
character = character.toLowerCase();
if (character >= 'a' && character <= 'z') {
    console.log("Alphabet");
}
else if (character >= '0' && character <= '9') {
    console.log("Digit");
}
else {
    console.log("Symbol");
}
//# sourceMappingURL=Question_08.js.map