import {test} from "../fixtures/baseFixture";
import { expect } from "@playwright/test";

import { readLoginData,LoginUser } from "../Utils/csvReader";

const user:LoginUser[] = readLoginData();

console.log("CSV Data",user);

const validuser = user.find(user => user.type === "valid")
const invaliduser = user.find(user => user.type === "invalid")

test.describe('Login test',()=>{
    test.beforeEach(async({LoginPage})=>{
        await LoginPage.navigate();
    })

    test('Valid Login',async({LoginPage,DashboardPage})=>{

        if(!validuser){
            throw new Error("No valid user")
        }

        await LoginPage.login(validuser.username,validuser.password)
        await expect(DashboardPage.dashboardTitle).toHaveText("Dashboard");

    })

    test('invalid Login',async({LoginPage})=>{

        if(!invaliduser){
            throw new Error("No invalid user")
        }

        await LoginPage.login(invaliduser.username,invaliduser.password)
        expect(await LoginPage.getErrorMessage()).toBe('Invalid credentials');
        

    })
})

