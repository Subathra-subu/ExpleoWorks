import {test,expect} from '../fixtures/baseFixture';
import loginData from '../testData/loginData.json';

test.describe.only('Cart Test',()=>{
    test.beforeEach(async({homePage,loginPage})=>{
        await homePage.navigate();
        await homePage.clickLogin();
        await loginPage.login(loginData.validlogin.username,loginData.validlogin.password);
    })
    test('Cart ',async({CartPage})=>{
        await CartPage.addtocart();
        await expect (CartPage.carttitle).toHaveText('Samsung galaxy s6');
    })
})