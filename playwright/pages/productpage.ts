import { Page } from "playwright";
import { Locators } from "../locators/Locators";

export  class ProductPage{

    constructor(private readonly page:Page){}


    async addToCart(){
      await this.page.getByRole("button",{name:"Add to cart"}).click();
    }
}