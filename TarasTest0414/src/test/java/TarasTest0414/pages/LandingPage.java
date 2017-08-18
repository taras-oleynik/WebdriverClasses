package TarasTest0414.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */

@DefaultUrl("https://github.com/")
public class LandingPage extends PageObject{

    @FindBy(xpath="//a[@class='btn site-header-actions-btn mr-2']")
    private WebElementFacade signInButton;

    public void signInToGithub() {
        signInButton.click();
    }




    //button[@class='btn btn-theme-green btn-jumbotron btn-block']
   // btn btn-theme-green btn-jumbotron btn-block
}
