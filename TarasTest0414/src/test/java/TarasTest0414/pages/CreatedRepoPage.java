package TarasTest0414.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */
public class CreatedRepoPage extends PageObject {


    @FindBy(id="repository_name")
    private WebElementFacade repoNameField;

    @FindBy(xpath="//button[@class='btn btn-primary first-in-line']")

    private WebElementFacade createNewRepoButton;

    public void createRepo(String name) {

        repoNameField.sendKeys(name);
        createNewRepoButton.click();
    }
}
