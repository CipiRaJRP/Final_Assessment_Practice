import {test as base} from '../fixtures/artifact-fixture'
import { shopflow } from '../flows/shopflow';

type PageFixtures = {
  shop:shopflow;
};

export const test = base.extend<PageFixtures>({

    shop:async({page},use)=>{
        await use(new shopflow(page));
    }

})

export {expect} from "@playwright/test"

