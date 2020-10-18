package com.example.tesktask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {
    WebDriver wd;
    MainPageHelper mainPage;
    HeaderHelper headerHelper;
    MarketItemHelper marketItem;
    String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        openSite("https://yandex.ru/");
        mainPage = new MainPageHelper(wd);
        headerHelper = new HeaderHelper(wd);
        marketItem = new MarketItemHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    private void openSite(String url) {
        wd.navigate().to(url);
    }

    public MainPageHelper getMainPage() {
        return mainPage;
    }

    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }

    public MarketItemHelper getMarketItem() {
        return marketItem;
    }
}
