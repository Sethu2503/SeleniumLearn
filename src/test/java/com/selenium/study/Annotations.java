package com.selenium.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

    WebDriver driver;
    //By Categories = By.xpath("//span[text()='Category']");

    @BeforeTest
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sethu\\Desktop\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        Reporter.log("Browser is opened");
    }


    @Test
    public void check() {
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();

        //Assert.assertSame("Online Shopping site in India", title, "Incorrect");

        WebElement Categories = driver.findElement(By.xpath("//span[text()='Category']"));
        WebElement Select1 = driver.findElement(By.xpath("//span[normalize-space(text())='Kindle E-Readers & eBooks']"));
        WebElement Select2 = driver.findElement(By.xpath("//span[normalize-space(text())='Kindle Exam Central']"));


        Actions actions = new Actions(driver);
        actions.moveToElement(Categories).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
        }
        actions.moveToElement(Select1).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
        }

        actions.moveToElement(Select2).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
        }

        actions.moveToElement(Select2).click();


    }

    @AfterTest
    public void check2() {
        //driver.close();
    }


}
