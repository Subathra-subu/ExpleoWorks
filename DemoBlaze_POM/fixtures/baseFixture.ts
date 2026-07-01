import {test as base,expect} from '@playwright/test'
import {loginPage} from '../pages/loginPage';
import {homePage} from '../pages/homePage';

type Fixtures = {
    loginPage:loginPage;
    homePage:homePage;
}

export const test = base.extend<Fixtures>({

    loginPage:async({page},use)=>{
        await use(new loginPage(page))
    },
    homePage:async({page},use)=>{
        await use(new homePage(page))
    }

})

export {expect};

