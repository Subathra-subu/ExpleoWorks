import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class LoginPage extends BasePage {

    private loginLink = "//a[text()='Login']";
    private email = "#input-email";
    private password = "#input-password";
    private loginBtn = "//input[@type='submit']";

    private successMessage = "//h2[text()='My Account']";
    private errorMessage = ".alert.alert-danger.alert-dismissible";


    async clickLoginLink() {
        await this.ClickDropDown();
        logger.info("Opening Login page");
        await this.Click(this.loginLink);
    }

    async enterEmail(user_email: string) {

        logger.info(`Entering Email : ${user_email}`);
        await this.type(this.email,user_email);
    }

    async enterPassword(user_password:string) {

        logger.info("Entering password");
        await this.type(this.password,user_password);
    }

    async clickLoginButton() {

        logger.info("Clicking Login button");
        await this.Click(this.loginBtn);
    }

    async getSuccessMessage() {

        logger.info("Fetching success message locator");
        return this.successMessage;
    }

    async getErrorMessage() {

        logger.info("Fetching error message locator");
        return this.errorMessage;
    }

}