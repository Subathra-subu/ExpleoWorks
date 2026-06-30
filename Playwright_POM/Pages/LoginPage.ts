import {Page,Locator} from '@playwright/test'

export class LoginPage{

    readonly page:Page;
    readonly userName:Locator;
    readonly password:Locator;
    readonly loginButton:Locator;
    readonly loginTitle:Locator;
    readonly errorMessage:Locator;

    constructor(page:Page){
        this.page = page;
        this.userName = page.getByPlaceholder("Username");
        this.password=page.getByPlaceholder("Password");
        this.loginButton=page.getByRole("button",{name:'Login'});
        this.loginTitle=page.getByRole('heading', { name: 'Login' });
        this.errorMessage=page.getByText('Invalid credentials');
    }

    async navigate(){
        await this.page.goto(process.env.base_url!);
        {
            waitUntil:'domcontentloaded'
        }
    }


async getLoginTitle(){
    return await this.loginTitle.textContent();
}

async login(Username:string,pass_word:string){

    await this.userName.fill(Username);
    await this.password.fill(pass_word);
    await this.loginButton.click();
}

async getErrorMessage(){
    return await this.errorMessage.textContent();
}

}
