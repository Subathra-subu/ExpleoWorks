# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: logoutTest.test.ts >> Logout Test @regression >> Logout @smoke
- Location: tests\logoutTest.test.ts:16:9

# Error details

```
Error: page.goto: net::ERR_ABORTED; maybe frame was detached?
Call log:
  - navigating to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", waiting until "load"

```

```
Error: locator.textContent: Target page, context or browser has been closed
```

# Test source

```ts
  1  | import {Page,Locator} from '@playwright/test'
  2  | 
  3  | export class LoginPage{
  4  | 
  5  |     readonly page:Page;
  6  |     readonly userName:Locator;
  7  |     readonly password:Locator;
  8  |     readonly loginButton:Locator;
  9  |     readonly loginTitle:Locator;
  10 |     readonly errorMessage:Locator;
  11 | 
  12 |     constructor(page:Page){
  13 |         this.page = page;
  14 |         this.userName = page.getByPlaceholder("Username");
  15 |         this.password=page.getByPlaceholder("Password");
  16 |         this.loginButton=page.getByRole("button",{name:'Login'});
  17 |         this.loginTitle=page.getByRole('heading', { name: 'Login' });
  18 |         this.errorMessage=page.getByText('Invalid credentials');
  19 |     }
  20 | 
  21 |     async navigate(){
  22 |         await this.page.goto(process.env.base_url!);
  23 |         {
  24 |             waitUntil:'domcontentloaded'
  25 |         }
  26 |     }
  27 | 
  28 | 
  29 | async getLoginTitle(){
> 30 |     return await this.loginTitle.textContent();
     |                                  ^ Error: locator.textContent: Target page, context or browser has been closed
  31 | }
  32 | 
  33 | async login(Username:string,pass_word:string){
  34 | 
  35 |     await this.userName.fill(Username);
  36 |     await this.password.fill(pass_word);
  37 |     await this.loginButton.click();
  38 | }
  39 | 
  40 | async getErrorMessage(){
  41 |     return await this.errorMessage.textContent();
  42 | }
  43 | 
  44 | }
  45 | 
```