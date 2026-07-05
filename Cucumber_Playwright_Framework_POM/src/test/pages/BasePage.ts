import {Page} from "playwright"
import {logger} from "../utils/Logger"

export class BasePage{
    constructor(protected page:Page){}

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