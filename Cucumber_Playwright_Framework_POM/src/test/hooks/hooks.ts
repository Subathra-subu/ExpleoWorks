import { Before,After,BeforeAll,AfterAll,setDefaultTimeout } from "@cucumber/cucumber";
import {chromium} from "playwright"
import { CustomWorld } from "../world/world";
import {logger} from "../utils/Logger";
import {LoginPage} from "../pages/LoginPage"
import { RegisterPage } from "../pages/RegisterPage";

setDefaultTimeout(60 * 1000);

let browser:any;

BeforeAll(async()=>{
    logger.info("Launching browser");
    browser=await chromium.launch();
});

Before(async function (this:CustomWorld,scenario){
    logger.info('Starting scenario: ${scenario.pickle.name}');

    this.browser = browser;
    this.context = await this.browser.newContext();
    this.page = await this.context.newPage();

    // this.loginPage = new LoginPage(this.page);
    this.registerPage = new RegisterPage(this.page);

})

After(async function(this:CustomWorld,scenario) {

    if(scenario.result?.status == "FAILED"){
        const path = `reports/screenshots/${scenario.pickle.name}_${Date.now()}.png`;
        await this.page.screenshot({path});
        logger.error(`Scenario FAILED:${scenario.pickle.name}`);
        logger.error(`Screenshot saved:${path}`);
    }
    else{
        logger.info(`Scenario PASSED:${scenario.pickle.name}`);
    }

    await this.page.close();
    await this.context.close();

})

AfterAll(async()=>{

    logger.info("Closing browser")
    await browser.close();

})
   
