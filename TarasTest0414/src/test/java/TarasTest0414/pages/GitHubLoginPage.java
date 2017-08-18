package TarasTest0414.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */


public class GitHubLoginPage extends PageObject {
    @FindBy(id="login_field")
    private WebElementFacade userEmail;

    @FindBy(id="password")
    private WebElementFacade userPassword;

    @FindBy(xpath="//*[@class='btn btn-primary btn-block']")
    private WebElementFacade signButton;




    public void loginToGithub(String email, String pass) {
        userEmail.sendKeys(email);
        userPassword.sendKeys(pass);
        signButton.click();
    }
}
