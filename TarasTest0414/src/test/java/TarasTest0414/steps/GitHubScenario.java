package TarasTest0414.steps;

import TarasTest0414.steps.serenity.EndUserGithubSteps;
import core.WebDriverStream;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebdriverManager;
import org.jbehave.core.annotations.*;

/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */
public class GitHubScenario {

    @AfterScenario
    public void ttt () {
//      Serenity.getWebdriverManager().getWebdriver().manage().deleteCookieNamed("user_session");
        ThucydidesWebdriverManager.inThisTestThread().getCurrentDriver().manage().deleteCookieNamed("user_session");

    }


    @Steps
    EndUserGithubSteps endUserGithubSteps;


    @Given("the user is on the Hithub landing page")
    public void givenTheUserIsOnTheHithubLandingPage() {
        endUserGithubSteps.goToLandingPage();    }

    @When("the user inputs login '$login' and the pass '$password'")
    public void whenTheUserInputsLoginAndPass(String login, String password) {
        endUserGithubSteps.signIn();
        endUserGithubSteps.loginByUser(login, password);
    }

    @Then("system redirects to Main page")
    public void thenSystemRedirectsToLogininPage() {
        endUserGithubSteps.redirectsToMainPage();
    }


    @Given("the user is on the Hithub Main page login '$login' and the pass '$password'")
    public void theUserIsOnTheHithubMainPage(String login, String password) {
        endUserGithubSteps.goToLandingPage();
        endUserGithubSteps.signIn();
        endUserGithubSteps.loginByUser(login, password);
        endUserGithubSteps.redirectsToMainPage();


    }


    @When("the user creates the New repo with a name '$JbehaveRepo'")
    public void theUserCreatesTheNewRepoWithName(String name){

        endUserGithubSteps.userCreatesNewRepo();
        endUserGithubSteps.userHasCreaedRepo(name);

    }


    @Then("system redirects to RepoCreated page")
    public void systemRedirectsToRepoCreatedPage(){}

}
