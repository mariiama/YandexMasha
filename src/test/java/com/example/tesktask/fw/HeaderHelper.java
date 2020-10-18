package com.example.tesktask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void searchItemFromSearchIBox(String itemName) {
        type(By.cssSelector("#header-search"), itemName);
        click(By.cssSelector("[type=submit]"));
    }
    public void selectComputersDepartment() {
        click(By.cssSelector("[href*='/catalog--kompiuternaia-tekhnika']"));
    }

}
