import { Page } from "playwright";
import { Locators } from "../locators/Locators";

export  class LoginPage{

    constructor(private readonly page:Page){}

    async enterTheEmail(email:string){
       await this.page.getByLabel("email").fill(email);
    }

    async enterThePassword(password:string){
        await this.page.getByLabel("password").fill(password);
    }

    async clickSignIn(){
        await this.page
          .getByRole("form", { name: "ShopKart sign in" })
          .getByRole("button", { name: "Sign in" })
          .click();
    }

}