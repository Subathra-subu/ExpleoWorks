import { LoginPage } from './../pages/LoginPage';
import {RegisterPage} from './../pages/RegisterPage'
import {Browser,BrowserContext,Page} from 'playwright';
import{logger} from '../utils/Logger'


export class CustomWorld{
    browser!:Browser;
    context!:BrowserContext;
    page!:Page;

    loginPage!:LoginPage;
    registerPage!:RegisterPage;

    logger=logger;
}