import { test, expect } from "../fixtures/shopfixtures";
import { Secrets } from "../src/secrets";
import { Util } from "../src/utils";
import { testdata } from "../src/testdata";

test('ShopKart Validation', async ({ shop, log, page }) => {

    log.info("Opening ShopKart home page");
    await shop.openHomePage();

    log.info("Navigating to login page");
    await shop.makeSignIn();
    await expect(page).toHaveURL("/login");
    log.info("Verified login page loaded");

    log.info("Entering user credentials with");
//     log.info({
//   email: Util.emailName(testdata.username1.name),
//   password: Secrets.get(`${testdata.username1.name}_PASSWORD`)
// });
    await shop.enterEmailAndPassword(
        Util.emailName(testdata.username1.name),
        Secrets.get(`${testdata.username1.name}_PASSWORD`)
    );
    log.info("Submitting login");
    await shop.clickOnSignIn();

    log.info(`Searching product: ${testdata.valid_product.name}`);
    await shop.searchProduct(testdata.valid_product.name);

    await expect(await shop.theProducts()).toHaveCount(1);
    log.info("Verified exactly one matching product is displayed");

    log.info("Opening product details page");
    await shop.clickTheProduct();
    await expect(page).toHaveURL(/\/product\//);
    log.info("Verified product details page");

    log.info("Adding product to cart");
    await shop.addTheProductToCart();
    await expect(page).toHaveURL("/cart");
    log.info("Verified cart page");

    log.info("Proceeding to checkout");
    await shop.makeAcheckout();
    await expect(page).toHaveURL("/checkout");
    log.info("Verified checkout page");

    log.info(`Entering shipping address: ${testdata.valid_product.address}`);
    await shop.enterTheAddress(testdata.valid_product.address);

    log.info("Placing order");
    await shop.placeTheOrder();

    await expect(page).toHaveURL(/\/orders\//);
    log.info("Verified order confirmation page");

    await expect(shop.checkTheStatus()).toHaveText("PLACED");
    log.info("Verified order status is PLACED");

    log.info(" -----✅ ShopKart Validation completed successfully-----");
});