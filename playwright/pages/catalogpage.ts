import { Page } from "playwright";
import { Locators } from "../locators/Locators";

export  class CatalogPage{

    constructor(private readonly page:Page){}

    
   async searchForAProductInCatalogPage(product:string){
       await this.page.getByPlaceholder("Search products").fill(product);
       await this.page.keyboard.press("Enter");
   }

    getproducts(){
      return  Locators.products(this.page);
   }

   async selectTheProduct(){
      return Locators.productImage(this.page).click();
   }

 

}