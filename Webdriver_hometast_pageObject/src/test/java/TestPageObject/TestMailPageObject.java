package TestPageObject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Taras_Oliinyk on 8/18/2017.
 */
public class TestMailPageObject {
    private WebDriver driver;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\Taras\\automation\\webdrivercalsses\\src\\main\\resources\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
