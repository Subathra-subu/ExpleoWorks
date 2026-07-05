import { BasePage } from './BasePage';

// import {logger} from '../utils/logger'

export class RegisterPage extends BasePage{

    private dropdown = "//span[@class='caret']";
    private registerLink = "//a[text()='Register']";
    private firstName = "#input-firstname";
    private lastName = "#input-lastname";
    private email = "#input-email";
    private telephone = "#input-telephone";
    private password = "#input-password";
    private confirm = "#input-confirm"
    private privacy = "//input[@type='checkbox']";
    private submit = "//input[@type='submit']";
    private successMessage = "//h1[text()='Your Account Has Been Created!']";
    private errorMessage = ".alert.alert-danger.alert-dismissible";

    async navigate(){
        //await this.open(process.env.base_url!);
        await this.open("https://tutorialsninja.com/demo");
    }

    async clickRegsiterLink(){
        await this.Click(this.dropdown);
        await this.Click(this.registerLink);
    }

    async enterRegisterDetails(fname:string,lname:string,email:string,tele:string,paasword:string,confirm:string){
        await this.type(this.firstName,fname);
        await this.type(this.lastName,lname);
        await this.type(this.email,email);
        await this.type(this.telephone,tele);
        await this.type(this.password,paasword);
        await this.type(this.confirm,confirm);       
    }

    async privacyCheck(){
        await this.Click(this.privacy);
    }

    async clickSubmit(){
        await this.Click(this.submit);
    }

    async getSuccessmessage(){
        return this.successMessage;
    }

    async getErrormessage(){
        return this.errorMessage;
    }

}