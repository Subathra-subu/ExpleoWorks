import {test} from "../fixtures/baseFixture";
import { expect } from "@playwright/test";

import loginData from "../testData/loginData.json"

test.describe('Dashboard Tests',()=>{

    test.beforeEach(async({LoginPage})=>{
        await LoginPage.navigate();
        await LoginPage.login(
            loginData.validUser.username,
            loginData.validUser.password
        )
    })

    test.afterEach(async({DashboardPage})=>{
        await DashboardPage.logout();
    })

    test('Verify Quick launch section @smoke',async({DashboardPage})=>{
        await expect(DashboardPage.quickLaunch).toBeVisible();
    })

    test('Verify Time at work section',async({DashboardPage})=>{
        await expect(DashboardPage.timeAtWorkCard).toBeVisible();
    })
    
})