
import { Page,Locator } from "@playwright/test";

export class Locators{

  static products(page: Page): Locator {
    return page.locator(".product-card.product")
}

   static productImage(page:Page):Locator{
       return page.locator(".product-image");
   }
   static orderStatus(page:Page){
      return page.locator('[data-field="order-status"]');
   }

   
}



