package wabdriver.hometas1.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Taras_Oliinyk on 8/18/2017.
 */
public class LoginInPage {


    private final WebDriver driver;

    public LoginInPage(WebDriver driver) {
        this.driver = driver;
    }

    public  InboxPage  login (String email, String password) {

return new InboxPage(driver);
    }


}

