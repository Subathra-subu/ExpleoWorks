import PromptSync from "prompt-sync";
const prompt = PromptSync();
let character = prompt("Enter the Character:");
character = character.toLowerCase();
switch (true) {
    case (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'):
        console.log("Vowel");
        break;
    case (character >= 'b' && character <= 'z'):
        console.log("Consonant");
        break;
    default:
        console.log("Symbol");
}
//# sourceMappingURL=Question_03.js.map