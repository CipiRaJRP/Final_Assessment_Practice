import { Page } from "playwright";
import { Locators } from "../locators/Locators";

export  class CheckoutPage{

    constructor(private readonly page:Page){}

    async enterAddress(address:string){
        await this.page.getByRole("textbox",{name:"address"}).fill(address);
    }

    async placeOrder(){
        await this.page.getByRole("button",{name:"Place order"}).click();
    }
}