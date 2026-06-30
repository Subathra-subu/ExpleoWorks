import {test} from "../fixtures/baseFixture";
import { expect } from "@playwright/test";

import loginData from "../testData/loginData.json"

test.describe('Logout Test @regression',()=>{

    test.beforeEach(async({LoginPage})=>{
        await LoginPage.navigate();
        await LoginPage.login(
            loginData.validUser.username,
            loginData.validUser.password
        )
    })

    test('Logout @smoke',async({DashboardPage})=>{
        DashboardPage.logout();
    })

    test.afterEach(async({LoginPage})=>{
        expect(await LoginPage.getLoginTitle()).toBe("Login");
    })

})