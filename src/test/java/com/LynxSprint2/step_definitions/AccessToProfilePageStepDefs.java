package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.AccessToProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccessToProfilePageStepDefs {

    AccessToProfilePage accessToProfilePage =new AccessToProfilePage();

    @And("user clicks on username on")
    public void user_clicks_on_username_on() {
       accessToProfilePage.userNameButton.click();
    }
    @Then("user click on profile")
    public void userClickOnProfile() {
        accessToProfilePage.myProfile.click();
    }


}
