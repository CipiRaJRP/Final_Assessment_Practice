import { Page } from "playwright";
import { Locators } from "../locators/Locators";

export  class CartPage{

    constructor(private readonly page:Page){}


    async checkout(){
       await this.page.getByRole("button",{name:"Checkout"}).click();
    }
}