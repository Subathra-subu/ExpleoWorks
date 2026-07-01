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
Received: ""
```

```
Error: page.goto: Test ended.
Call log:
  - navigating to "https://www.demoblaze.com/", waiting until "load"

```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - dialog [ref=e2]:
    - document [ref=e3]:
      - generic [ref=e4]:
        - generic [ref=e5]:
          - heading [level=5] [ref=e6]: New message
          - button [ref=e7]: ×
        - generic [ref=e9]:
          - generic [ref=e10]:
            - text: "Contact Email:"
            - textbox [ref=e11]
          - generic [ref=e12]:
            - text: "Contact Name:"
            - textbox [ref=e13]
          - generic [ref=e14]:
            - text: "Message:"
            - textbox [ref=e15]
        - generic [ref=e16]:
          - button [ref=e17]: Close
          - button [ref=e18]: Send message
  - dialog [ref=e19]:
    - document [ref=e20]:
      - generic [ref=e21]:
        - generic [ref=e22]:
          - heading [level=5] [ref=e23]: Sign up
          - button [ref=e24]: ×
        - generic [ref=e26]:
          - generic [ref=e27]:
            - text: "Username:"
            - textbox [ref=e28]
          - generic [ref=e29]:
            - text: "Password:"
            - textbox [ref=e30]
        - generic [ref=e31]:
          - button [ref=e32]: Close
          - button [ref=e33]: Sign up
  - dialog [ref=e34]:
    - document [ref=e35]:
      - generic [ref=e36]:
        - generic [ref=e37]:
          - heading [level=5] [ref=e38]: Log in
          - button [ref=e39]: ×
        - generic [ref=e41]:
          - generic [ref=e42]:
            - text: "Username:"
            - textbox [ref=e43]
          - generic [ref=e44]:
            - text: "Password:"
            - textbox [ref=e45]
        - generic [ref=e46]:
          - button [ref=e47]: Close
          - button [ref=e48]: Log in
  - dialog [ref=e49]:
    - generic [ref=e51]:
      - generic [ref=e52]:
        - heading "About us" [level=5] [ref=e53]
        - button "Close" [ref=e54]: ×
      - button "Close" [ref=e60]
  - navigation [ref=e61]:
    - button "Toggle navigation" [ref=e62]
    - link "PRODUCT STORE" [ref=e63] [cursor=pointer]:
      - /url: index.html
      - img [ref=e64]
      - text: PRODUCT STORE
    - list [ref=e66]:
      - listitem [ref=e67]:
        - link "Home (current)" [ref=e68] [cursor=pointer]:
          - /url: index.html
      - listitem [ref=e69]:
        - link "Contact" [ref=e70] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e71]:
        - link "About us" [ref=e72] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e73]:
        - link "Cart" [ref=e74] [cursor=pointer]:
          - /url: cart.html
      - listitem [ref=e75]:
        - link "Log in" [ref=e76] [cursor=pointer]:
          - /url: "#"
      - listitem
      - listitem
      - listitem [ref=e77]:
        - link "Sign up" [ref=e78] [cursor=pointer]:
          - /url: "#"
    - generic [ref=e80]:
      - list [ref=e81]:
        - listitem [ref=e82]
        - listitem [ref=e83]
        - listitem [ref=e84]
      - generic [ref=e85]:
        - generic [ref=e86]:
          - img "First slide"
        - generic [ref=e87]:
          - img "Second slide"
        - generic [ref=e88]:
          - img "Third slide"
      - button "Previous" [ref=e89] [cursor=pointer]
      - button "Next" [ref=e90] [cursor=pointer]
  - generic [ref=e92]:
    - generic [ref=e94]:
      - link "CATEGORIES" [ref=e95] [cursor=pointer]:
        - /url: ""
      - link "Phones" [ref=e96] [cursor=pointer]:
        - /url: "#"
      - link "Laptops" [ref=e97] [cursor=pointer]:
        - /url: "#"
      - link "Monitors" [ref=e98] [cursor=pointer]:
        - /url: "#"
    - list [ref=e100]:
      - listitem [ref=e101]:
        - button "Previous" [ref=e102]
      - listitem [ref=e103]:
        - button "Next" [ref=e104] [cursor=pointer]
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
> 16 |         await this.page.goto(process.env.base_url!),{
     |                         ^ Error: page.goto: Test ended.
  17 |             waitUntil:"domcontentloaded"
  18 |         };
  19 |     }
  20 | 
  21 |     async clickLogin(){
  22 |         await this.loginLink.click();
  23 |     }
  24 | 
  25 |     async verifyValidLogin(){
  26 |         return await this.successMessage.textContent();
  27 |     }
  28 | }
```