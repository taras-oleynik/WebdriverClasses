package TarasTest0414.pages;

import net.thucydides.core.pages.PageObject;

/**
 * Created by Taras_Oliinyk on 5/5/2016.
 */
public class NewRepoPage extends PageObject {

    public String getRepoPageTitle(){
        return  this.getTitle();
    }
}
