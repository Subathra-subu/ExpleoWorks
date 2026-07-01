import {Page,Locator} from '@playwright/test'

export class homePage{

    readonly page:Page
    readonly loginLink:Locator
    readonly successMessage:Locator

    constructor(page:Page){
        this.page=page;
        this.loginLink = page.getByRole("link",{name:"Log in"});
        this.successMessage=page.locator("#nameofuser");
    }

    async navigate(){
        await this.page.goto(process.env.base_url!),{
            waitUntil:"domcontentloaded"
        };
    }

    async clickLogin(){
        await this.loginLink.click();
    }
}