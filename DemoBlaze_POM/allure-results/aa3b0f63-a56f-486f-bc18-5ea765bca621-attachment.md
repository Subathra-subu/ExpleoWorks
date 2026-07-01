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
Timeout:  5000ms

Call log:
  - Expect "toHaveText" with timeout 5000ms
  - waiting for locator('#nameofuser')
    9 × locator resolved to <a href="#" id="nameofuser" class="nav-link"></a>
      - unexpected value ""
    - waiting for" https://www.demoblaze.com/" navigation to finish...
    - navigated to "https://www.demoblaze.com/"
    3 × locator resolved to <a href="#" id="nameofuser" class="nav-link"></a>
      - unexpected value ""

```

```yaml
- navigation:
  - link "PRODUCT STORE":
    - /url: index.html
    - img
    - text: PRODUCT STORE
  - list:
    - listitem:
      - link "Home (current)":
        - /url: index.html
    - listitem:
      - link "Contact":
        - /url: "#"
    - listitem:
      - link "About us":
        - /url: "#"
    - listitem:
      - link "Cart":
        - /url: cart.html
    - listitem:
      - link "Log in":
        - /url: "#"
    - listitem
    - listitem
    - listitem:
      - link "Sign up":
        - /url: "#"
  - list:
    - listitem
    - listitem
    - listitem
  - img "First slide"
  - button "Previous"
  - button "Next"
- link "CATEGORIES":
  - /url: ""
- link "Phones":
  - /url: "#"
- link "Laptops":
  - /url: "#"
- link "Monitors":
  - /url: "#"
- list:
  - listitem:
    - button "Previous"
  - listitem:
    - button "Next"
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
> 11 |         await expect(homePage.successMessage).toHaveText(`Welcome ${loginData.validlogin.username}`); 
     |                                               ^ Error: expect(locator).toHaveText(expected) failed
  12 |     });
  13 | });
  14 | 
  15 | 
```