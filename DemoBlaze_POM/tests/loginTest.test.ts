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

    test('invalid login',async({page,homePage,loginPage})=>{
        
        await homePage.clickLogin();

        for(let i=0;i<user.length;i++){

            const dialogPromise = page.waitForEvent('dialog');
            await loginPage.login(user[i]!.username,user[i]!.password);

            const dialog = await dialogPromise;
            expect(dialog.message()).toBe(user[i]!.errormessage);
            dialog.accept();
        }

    });
});

