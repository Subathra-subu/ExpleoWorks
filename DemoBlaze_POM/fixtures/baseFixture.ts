import {test as base,expect} from '@playwright/test'
import {loginPage} from '../pages/loginPage';
import {homePage} from '../pages/homePage';
import { CartPage } from '../pages/cartPage';

type Fixtures = {
    loginPage:loginPage;
    homePage:homePage;
    CartPage:CartPage;
}

export const test = base.extend<Fixtures>({

    loginPage:async({page},use)=>{
        await use(new loginPage(page))
    },
    homePage:async({page},use)=>{
        await use(new homePage(page))
    },
    CartPage:async({page},use)=>{
        await use(new CartPage(page))
    }

})

export {expect};

