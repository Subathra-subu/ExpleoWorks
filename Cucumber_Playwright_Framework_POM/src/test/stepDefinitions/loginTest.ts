import { Given, When, Then } from "@cucumber/cucumber";
import { expect } from "@playwright/test";
import { CustomWorld } from "../world/world";
import loginData from "../../../testData/loginData.json";

Given('User clicks on the login link', async function (this: CustomWorld) {

    await this.loginPage.clickLoginLink();

});

Given('User enter the email as {string}', async function (this: CustomWorld, email) {

    await this.loginPage.enterEmail(email);

});

Given('User enter the password as {string}', async function (this: CustomWorld, password) {

    await this.loginPage.enterPassword(password);

});

When('the user click login button', async function (this: CustomWorld) {

    await this.loginPage.clickLoginButton();

});

Then('the login should be successful', async function (this: CustomWorld) {

    await expect(
        this.page.locator(await this.loginPage.getSuccessMessage())).toBeVisible();

});

Given('User enter invalid credentials from json file', async function (this: CustomWorld) {

    await this.loginPage.enterEmail(loginData.invalidUser.email)
    await this.loginPage.enterPassword(loginData.invalidUser.password);

});

Then('the login should fail', async function (this: CustomWorld) {

    await expect(
        this.page.locator(await this.loginPage.getErrorMessage())).toBeVisible();

});