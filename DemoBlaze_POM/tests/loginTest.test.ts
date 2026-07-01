import {test,expect} from '../fixtures/baseFixture'
import loginData from '../testData/loginData.json'
import {readLoginData,loginuser} from "../utility/csvReader";

test.describe('Login Tests',()=>{
const user:loginuser[] = readLoginData();

    test.beforeEach(async({homePage})=>{
        await homePage.navigate();
    })
    test('valid login',async({homePage,loginPage})=>{
        await homePage.clickLogin();
        await loginPage.login(loginData.validlogin.username,loginData.validlogin.password);
        await expect(homePage.successMessage).toHaveText(`Welcome ${loginData.validlogin.username}`); 
    });

    test('invalid login',async({homePage,loginPage})=>{
        await homePage.clickLogin();
        await loginPage.login(user[0]!.username,user[0]!.password);
    });
});

