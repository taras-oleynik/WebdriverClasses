package TarasTest0414.steps.serenity;

import TarasTest0414.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


/**
 * Created by Taras_Oliinyk on 4/19/2016.
 */
public class EndUserGithubSteps extends ScenarioSteps {

    LandingPage landingPage;
    GitHubLoginPage gitHubLoginPage;
    GitHubMainPage gitHubMainPage;
    CreatedRepoPage createdRepoPage;
    NewRepoPage newRepoPage;


    @Step
    public void goToLandingPage() {
        landingPage.open();
    }

    @Step
    public GitHubLoginPage signIn() {
        landingPage.signInToGithub();
        return  gitHubLoginPage;
    }

    @Step
    public GitHubMainPage loginByUser(String login, String pass) {
        gitHubLoginPage.loginToGithub(login, pass);
        return gitHubMainPage;
    }

    @Step
    public void redirectsToMainPage() {
        assertEquals("Title is incorrect!", "Learn Git and GitHub without any code!", gitHubMainPage.getMainPagetitle());

    }


    @Step

    public CreatedRepoPage userCreatesNewRepo() {
        gitHubMainPage.newRepocreation();
        return  createdRepoPage;
    }

    @Step
    public void userHasCreaedRepo(String name) {
        createdRepoPage.createRepo(name);

    }
    @Step
    public void repoCreatedSuccsefully(){
        assertEquals("Title is corrcect,repo has been created","taras-oleynik/JbehaveRepo",newRepoPage.getRepoPageTitle());
    }
}
