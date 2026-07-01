import { Page,Locator } from "@playwright/test";

export class loginPage{

    readonly page:Page;
    readonly userName:Locator;
    readonly password:Locator;
    readonly loginButton:Locator;

    constructor(page:Page){
        this.page=page;
        this.userName = page.locator("#loginusername");
        this.password = page.locator("#loginpassword");
        this.loginButton = page.getByRole("button",{name:'Log in'});
    }

    async login(user_Name:string,pass_word:string){
        await this.userName.fill(user_Name);
        await this.password.fill(pass_word);
        await this.loginButton.click();
    }
}