import { Given,When,Then } from "@cucumber/cucumber";
import { CustomWorld } from "../world/world";
import {expect} from '@playwright/test'
import { faker } from '@faker-js/faker';

Given('Launch the application', async function (this:CustomWorld) {

    await this.registerPage.navigate();
  
});

When('the user click Register link', async function (this:CustomWorld) {

    await this.registerPage.clickRegsiterLink();

});

When('the user enters the required details', async function (this:CustomWorld,dataTable) {

    const data = dataTable.rows()[0];
    let email;
    email = data[2]==="dynamic"?faker.internet.email():data[2];
        await this.registerPage.enterRegisterDetails(data[0],data[1],email,data[3],data[4],data[5]);
});

When('the user click the privacy policy', async function (this:CustomWorld) {
  
    await this.registerPage.privacyCheck()

});

When('the user click continue button', async function (this:CustomWorld) {
  
    await this.registerPage.clickSubmit();

});

Then('the user should able register successfully', async function (this:CustomWorld) {
    
    await expect (this.page.locator(await this.registerPage.getSuccessmessage())).toBeVisible();

});

Then('the user should able to see the error message', async function (this:CustomWorld) {

    await expect (this.page.locator(await this.registerPage.getErrormessage())).toBeVisible();
  
});