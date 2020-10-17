package com.example.tesktask;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchItimTestsForMarket extends TestBase{


    @Test
    public void testItem()
    {
        goToMarket();
        switchToNextTab();
        selectComputersDepartment();
        filterItem(new Item("planshety", "20000", "35000", "Apple"));
        String itemName = wd.findElement (By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();
        System.out.println(itemName);

    }

}
