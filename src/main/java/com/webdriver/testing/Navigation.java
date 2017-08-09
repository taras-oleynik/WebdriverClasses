package com.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Taras_Oliinyk on 8/8/2017.
 */
public class Navigation {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Taras\\automation\\webdrivercalsses\\src\\main\\resources\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.rediff.com/");

        driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();// closses curent browser driver.quit destroy ff driver
    }
}
