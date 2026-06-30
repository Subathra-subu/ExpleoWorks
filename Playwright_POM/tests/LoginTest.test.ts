import {test} from "../fixtures/baseFixture";
import { expect } from "@playwright/test";

import loginData from "../testData/loginData.json"

test.describe('Login_tests',()=>{
    test.beforeEach(async({LoginPage})=>{
        await LoginPage.navigate();
    })

    test('InvalidLogin',async({LoginPage})=>{
        await LoginPage.login(
            loginData.InvalidUser.username,
            loginData.InvalidUser.password
        )

        expect(await LoginPage.getErrorMessage()).toBe('Invalid credentials');
    })

    test('ValidLogin @smoke',async({LoginPage,DashboardPage})=>{
        await LoginPage.login(
            loginData.validUser.username,
            loginData.validUser.password
        )

        await expect(DashboardPage.dashboardTitle).toBeVisible();
        
    })
})