package com.selenium.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {


    @Test(description = "TestSummary")
    public void TitleCheck() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sethu\\Desktop\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("Browser is opened");
        driver.get("https://www.google.com");
        String title = driver.getTitle();

        Assert.assertEquals("Google", title, "Incorrect");


        driver.close();
    }


}
