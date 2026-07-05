import { BasePage } from './BasePage';
import {logger} from '../utils/Logger';

export class RegisterPage extends BasePage{

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

    async clickRegsiterLink(){
        await this.ClickDropDown();
        logger.info("Opening Register page");
        await this.Click(this.registerLink);
    }

    async enterRegisterDetails(fname:string,lname:string,email:string,tele:string,paasword:string,confirm:string){
        logger.info(`Entering registration details for ${fname} ${lname}`);
        logger.info(`Email: ${email}`);

        await this.type(this.firstName,fname);
        await this.type(this.lastName,lname);
        await this.type(this.email,email);
        await this.type(this.telephone,tele);
        await this.type(this.password,paasword);
        await this.type(this.confirm,confirm);       
    }

    async privacyCheck(){
        logger.info("Selecting privacy policy checkbox");
        await this.Click(this.privacy);
    }

    async clickSubmit(){
        logger.info("Clicking Register button");
        await this.Click(this.submit);
    }

    async getSuccessmessage(){
        logger.info("Fetching success message locator");
        return this.successMessage;
    }

    async getErrormessage(){
        logger.info("Fetching error message locator");
        return this.errorMessage;
    }

}