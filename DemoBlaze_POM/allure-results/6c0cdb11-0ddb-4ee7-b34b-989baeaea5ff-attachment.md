# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: loginTest.test.ts >> Login Tests >> valid login
- Location: tests\loginTest.test.ts:5:9

# Error details

```
Error: expect(received).toBe(expected) // Object.is equality

Expected: "Welcome admin"
Received: Promise {}
```

```
Error: page.goto: Test ended.
Call log:
  - navigating to "https://www.demoblaze.com/", waiting until "load"

```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - navigation [ref=e2]:
    - link "PRODUCT STORE" [ref=e3] [cursor=pointer]:
      - /url: index.html
      - img [ref=e4]
      - text: PRODUCT STORE
    - list [ref=e6]:
      - listitem [ref=e7]:
        - link "Home (current)" [ref=e8] [cursor=pointer]:
          - /url: index.html
          - text: Home
          - generic [ref=e9]: (current)
      - listitem [ref=e10]:
        - link "Contact" [ref=e11] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e12]:
        - link "About us" [ref=e13] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e14]:
        - link "Cart" [ref=e15] [cursor=pointer]:
          - /url: cart.html
      - listitem [ref=e16]:
        - link "Log in" [ref=e17] [cursor=pointer]:
          - /url: "#"
      - listitem
      - listitem
      - listitem [ref=e18]:
        - link "Sign up" [ref=e19] [cursor=pointer]:
          - /url: "#"
    - generic [ref=e21]:
      - list [ref=e22]:
        - listitem [ref=e23] [cursor=pointer]
        - listitem [ref=e24] [cursor=pointer]
        - listitem [ref=e25] [cursor=pointer]
      - img "First slide" [ref=e28]
      - button "Previous" [ref=e29] [cursor=pointer]:
        - generic [ref=e31]: Previous
      - button "Next" [ref=e32] [cursor=pointer]:
        - generic [ref=e34]: Next
  - generic [ref=e36]:
    - generic [ref=e38]:
      - link "CATEGORIES" [ref=e39] [cursor=pointer]:
        - /url: ""
      - link "Phones" [ref=e40] [cursor=pointer]:
        - /url: "#"
      - link "Laptops" [ref=e41] [cursor=pointer]:
        - /url: "#"
      - link "Monitors" [ref=e42] [cursor=pointer]:
        - /url: "#"
    - list [ref=e45]:
      - listitem [ref=e46]:
        - button "Previous" [ref=e47]
      - listitem [ref=e48]:
        - button "Next" [ref=e49] [cursor=pointer]
  - generic [ref=e51]:
    - generic [ref=e54]:
      - heading "About Us" [level=4] [ref=e55]
      - paragraph [ref=e56]: We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.
    - generic [ref=e59]:
      - heading "Get in Touch" [level=4] [ref=e60]
      - paragraph [ref=e61]: "Address: 2390 El Camino Real"
      - paragraph [ref=e62]: "Phone: +440 123456"
      - paragraph [ref=e63]: "Email: demo@blazemeter.com"
    - heading "PRODUCT STORE" [level=4] [ref=e67]:
      - img [ref=e68]
      - text: PRODUCT STORE
  - contentinfo [ref=e69]:
    - paragraph [ref=e70]: Copyright © Product Store
```

# Test source

```ts
  1  | import {Page,Locator} from '@playwright/test'
  2  | 
  3  | export class homePage{
  4  | 
  5  |     readonly page:Page
  6  |     readonly loginLink:Locator
  7  |     readonly successMessage:Locator
  8  | 
  9  |     constructor(page:Page){
  10 |         this.page=page;
  11 |         this.loginLink = page.getByRole("link",{name:"Log in"});
  12 |         this.successMessage=page.locator("#nameofuser");
  13 |     }
  14 | 
  15 |     async navigate(){
> 16 |         this.page.goto(process.env.base_url!);
     |                   ^ Error: page.goto: Test ended.
  17 |     }
  18 | 
  19 |     async clickLogin(){
  20 |         await this.loginLink.click();
  21 |     }
  22 | 
  23 |     async verifyValidLogin(){
  24 |         return await this.successMessage.textContent();
  25 |     }
  26 | }
```