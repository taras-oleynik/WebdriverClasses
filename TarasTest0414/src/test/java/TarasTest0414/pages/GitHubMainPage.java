package TarasTest0414.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */
public class GitHubMainPage extends PageObject {

    @FindBy(xpath="//a[@class='btn btn-sm btn-primary']")
    private WebElementFacade newRepoButton;

    @FindBy(xpath = "//h2[@class='shelf-title']")
    private WebElementFacade title;

    public void newRepocreation() {
        newRepoButton.click();
    }

    public String getMainPagetitle(){
       return title.getText();
    }
}
