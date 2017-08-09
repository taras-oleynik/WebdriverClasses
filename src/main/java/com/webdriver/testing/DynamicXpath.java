package com.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Taras_Oliinyk on 8/8/2017.
 */
public class DynamicXpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Taras\\automation\\webdrivercalsses\\src\\main\\resources\\bin\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");
      List<WebElement> list= driver.findElements(By.xpath("//*[contains(@id,'sbse2')]/div"));
      System.out.print(list.size());
    }
}
