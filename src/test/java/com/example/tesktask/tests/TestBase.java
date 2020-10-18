package com.example.tesktask.tests;

import com.example.tesktask.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager Manager =
            new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));

    @BeforeClass
    public void setUp(){
        Manager.init();
    }

    @AfterClass (enabled = false)
    public void tearDown(){
        Manager.stop();
    }

}
