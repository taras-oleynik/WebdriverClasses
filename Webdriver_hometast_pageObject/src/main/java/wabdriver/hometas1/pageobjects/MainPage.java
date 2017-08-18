package wabdriver.hometas1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Taras_Oliinyk on 8/18/2017.
 */
public class MainPage {

    public static final String HTTPS_WWW_GOOGLE_COM_INTL_RU_GMAIL_ABOUT = "https://www.google.com/intl/ru/gmail/about";

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(HTTPS_WWW_GOOGLE_COM_INTL_RU_GMAIL_ABOUT + "/");
    }

    public LoginInPage clickOnSignInButton(){

        driver.findElement(By.cssSelector("a[data-g-label='Sign in']")).click();
        return new LoginInPage(driver);
    }

}
