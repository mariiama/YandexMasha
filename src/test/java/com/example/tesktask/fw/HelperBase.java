package com.example.tesktask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this. wd = wd;
    }

    public void switchToNextTab () {
        List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            wd.switchTo().window(availableWindows.get(1));
        }
    }
    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        if (text != null) {
            wd.findElement(locator).sendKeys(text);
        }
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
