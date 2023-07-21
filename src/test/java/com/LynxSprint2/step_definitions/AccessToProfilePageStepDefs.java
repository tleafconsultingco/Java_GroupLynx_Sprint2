package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.AccessToProfilePage;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.List;

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

    @Then("user should see options button General,Drive,Tasks,Calendar,Conversations")
    public void userShouldSeeOptionsButtonGeneralDriveTasksCalendarConversations() {
       /* Assert.assertTrue(accessToProfilePage.generalButton.isDisplayed());
        Assert.assertTrue(accessToProfilePage.driverButton.isDisplayed());
        Assert.assertTrue(accessToProfilePage.tasksButton.isDisplayed());
        Assert.assertTrue(accessToProfilePage.calendarButton.isDisplayed());
        Assert.assertTrue(accessToProfilePage.conversationsButton.isDisplayed());
*/
       for (WebElement option:accessToProfilePage.elements) {
            Assert.assertTrue(option.isDisplayed());
        }

    }

}
