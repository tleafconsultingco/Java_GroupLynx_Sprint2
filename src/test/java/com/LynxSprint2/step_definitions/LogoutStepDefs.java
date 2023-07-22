package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LogoutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LogoutStepDefs {

    LogoutPage logoutPage = new LogoutPage();

    @Then("user clicks on profile page")
    public void user_clicks_on_profile_page() {

        logoutPage.userNameButton.click();

    }

    @Then("user clicks on logout button")
    public void userClicksOnLogoutButton() {

        logoutPage.logOutButton.click();

    }

    @Then("user sees five options under the profile name")
    public void userSeesFiveOptionsUnderTheProfileName() {

        for (WebElement each : logoutPage.profile_edit_logout) {

            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());

        }

        Assert.assertTrue(logoutPage.teamButton.isDisplayed());
        Assert.assertTrue(logoutPage.config.isDisplayed());

    }
}
