# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: loginTest.test.ts >> Login Tests >> valid login
- Location: tests\loginTest.test.ts:8:9

# Error details

```
Error: expect(locator).toHaveText(expected) failed

Locator:  locator('#nameofuser')
Expected: "Welcome admin"
Received: ""

Call log:
  - Expect "toHaveText" with timeout 5000ms
  - waiting for locator('#nameofuser')

```

# Test source

```ts
  1  | import {test,expect} from '../fixtures/baseFixture'
  2  | import loginData from '../testData/loginData.json'
  3  | 
  4  | test.describe('Login Tests',()=>{
  5  |     test.beforeEach(async({homePage})=>{
  6  |         await homePage.navigate();
  7  |     })
  8  |     test('valid login',async({homePage,loginPage})=>{
  9  |         await homePage.clickLogin();
  10 |         await loginPage.login(loginData.validlogin.username,loginData.validlogin.password);
> 11 |         expect(await homePage.verifyValidLogin()).toHaveText(`Welcome ${loginData.validlogin.username}`); 
     |                                                   ^ Error: expect(locator).toHaveText(expected) failed
  12 |     });
  13 | });
  14 | 
  15 | 
```