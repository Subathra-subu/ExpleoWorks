import { Given, When, Then } from "@cucumber/cucumber";
import { expect } from "@playwright/test";
import { CustomWorld } from "../world/world";
import { readSearchData, searchItem } from "../utils/csvReader";

const data:searchItem[] = readSearchData();


When('User searches for a product from csv file using searchbox and searchbutton', async function (this:CustomWorld) {

    await this.searchPage.searchProduct(data[0].searchitem);
  
});

Then('all displayed products should contain the searched keyword', async function (this:CustomWorld) {

    const products =await this.searchPage.getProducts();

    const list =await products.allInnerTexts();

    console.log(list);

    for(const product of list){

        expect(product).toContain(data[0].searchitem);

    }
  
});