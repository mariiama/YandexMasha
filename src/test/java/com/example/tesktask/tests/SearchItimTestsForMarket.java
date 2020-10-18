package com.example.tesktask.tests;

import com.example.tesktask.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItimTestsForMarket extends TestBase{


    @Test
    public void testItem() throws InterruptedException {
        Manager.getMainPage().goToMarket();
        Manager.getMainPage().switchToNextTab();
        Manager.getHeaderHelper().selectComputersDepartment();
        Thread.sleep(2000);
        Manager.getMarketItem().filterItem(new Item("planshety", "20000", "35000", "Apple"));
        Thread.sleep(2000);
        String itemName = Manager.getMarketItem().getItemNameFromListByOrder(2);
        System.out.println(itemName);
        Manager.getHeaderHelper().searchItemFromSearchIBox(itemName);
        Thread.sleep(1000);
        String foundItemName = Manager.getMarketItem().getItemNameFromListByOrder(1);
        Assert.assertEquals(foundItemName,itemName);

    }

}
