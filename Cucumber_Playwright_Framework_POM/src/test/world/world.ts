import { LoginPage } from './../pages/LoginPage';
import {RegisterPage} from './../pages/RegisterPage'
import {Browser,BrowserContext,Page} from 'playwright';
import{logger} from '../utils/Logger'
import { SearchPage } from '../pages/SearchPage';

import dotenv from 'dotenv';

const envName = process.env.ENV || 'qa';

dotenv.config({
    path: `./env/.env.${envName}`
});

export class CustomWorld{
    browser!:Browser;
    context!:BrowserContext;
    page!:Page;

    loginPage!:LoginPage;
    registerPage!:RegisterPage;
    searchPage!:SearchPage;

    logger=logger;
}