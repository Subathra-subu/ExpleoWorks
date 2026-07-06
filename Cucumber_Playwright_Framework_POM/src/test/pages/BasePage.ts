import {Page} from "playwright"
import {logger} from "../utils/Logger"

export class BasePage{

    private dropdown = "//span[@class='caret']";

    constructor(protected page:Page){}

    async navigate(){
        logger.info("Navigating to Tutorials Ninja application");
        await this.open(process.env.BASE_URL!);
        // await this.open("https://tutorialsninja.com/demo");
    }

    async ClickDropDown(){
        await this.Click(this.dropdown);
    }

    async Click(locator:string){
        logger.info(`Clicking: ${locator}`);
        await this.page.locator(locator).click();
    }
    async getByRoleClick(locator:string){
        logger.info(`Clicking: ${locator}`);
        await this.page.getByRole(locator as any).click();
    }
     async getText(locator:string){
        logger.info(`Typing: ${locator}`);
        return await this.page.locator(locator).innerText();
    }
     async type(locator:string,text:string){
        logger.info(`Getting text: ${locator}`);
        await this.page.locator(locator).fill(text);
    }
     async open(url:string){
        await this.page.goto(url);
    }
}