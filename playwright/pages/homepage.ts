import { Page } from "playwright";
import { Locators } from "../locators/Locators";
export  class HomePage {

    constructor(private readonly page:Page){}

    async open(){
        await this.page.goto('');
    }

    async signIn(){
        await this.page.getByRole("button",{name:"Sign in"}).click();
    }

}