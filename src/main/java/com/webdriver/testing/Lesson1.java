package com.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Taras_Oliinyk on 8/4/2017.
 */
public class Lesson1 {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver", "D:\\Taras\\automation\\webdrivercalsses\\src\\main\\resources\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/");
//        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[7]")).click();

        driver.close();
    }



}
