package com.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Taras_Oliinyk on 8/9/2017.
 */
public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Taras\\automation\\webdrivercalsses\\src\\main\\resources\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       List<WebElement> list =  driver.findElements(By.xpath("//input[@name='group1']"));
        System.out.println(list.size());

        for (WebElement e: list){
            System.out.println(e.getAttribute("value"));
            System.out.println(e.isSelected());
            if (e.getAttribute("value").equals("Cheese")){
                e.click();
            }
        }
    }
}
