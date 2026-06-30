import {Page,Locator} from '@playwright/test'

export class DashboardPage{

    readonly page:Page;
    readonly dashboardTitle:Locator;
    readonly quickLaunch:Locator;
    readonly timeAtWorkCard:Locator;
    readonly profile:Locator;
    readonly logoutLink:Locator

    constructor(page:Page){
        this.page=page;
        this.dashboardTitle=page.locator("//h6[text()='Dashboard']")
        this.quickLaunch = page.locator("//p[text()='Quick Launch']")
        this.timeAtWorkCard = page.locator("//p[text()='Time at Work']")
        this.profile = page.locator(".oxd-userdropdown-tab")
        this.logoutLink = page.locator("//a[text()='Logout']")

    }

    async dashboard(){
        return await this.dashboardTitle.isVisible({timeout:10000});
    }

    async logout(){
        await this.profile.click();
        await this.logoutLink.click();
    }
}
