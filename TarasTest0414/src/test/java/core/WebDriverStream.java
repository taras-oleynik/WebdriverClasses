package core;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Taras_Oliinyk on 4/26/2016.
 */
public class WebDriverStream extends PageObject {

    private static WebDriver driver;

    private WebDriverStream() {
    }

    public static WebDriver getWebDriver() {
        if (null == driver)
            driver = new FirefoxDriver();
        return driver;

    }

}
