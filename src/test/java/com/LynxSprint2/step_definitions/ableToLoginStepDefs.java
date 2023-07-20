package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ableToLoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("users logging in with Valid {string},{string}")
    public void users_Logging_In_With_Valid(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("user should land on Home page with {string}")
    public void userShouldLandOnHomePageWith(String title) {
        title= "Portal";
        Assert.assertTrue("NO TITLE", Driver.getDriver().getTitle().contains(title));
        System.out.println("Logged in");
    }


    @When("users logging in with inValid {string},{string}")
    public void usersLoggingInWithInValid(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("user should see validation message {string}")
    public void userShouldSeeValidationMessage(String message) {
        message= "Incorrect login or password";
        Assert.assertEquals("Not match",message,loginPage.errMessage.getText());
        System.out.println("Error message");
    }
}


