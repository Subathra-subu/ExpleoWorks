import { BasePage } from "./BasePage";
import { logger } from "../utils/Logger";

export class SearchPage extends BasePage {

    private searchBox = "input[name='search']";
    private searchBtn = ".btn.btn-default.btn-lg";

    private productList = "//h4";

    async searchProduct(searchItem:string){
        logger.info(`Searching product : ${searchItem}`);

        await this.type(this.searchBox,searchItem);
        await this.Click(this.searchBtn);
    }

    async getProducts() {

        logger.info("Fetching searched products");
        return this.page.locator(this.productList);

    }

}