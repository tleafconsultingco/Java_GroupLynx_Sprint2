package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AbleToLoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("users logging in with Valid credentials {string}")
    public void usersLoggingInWithValidCredentials(String userType) {
        loginPage.loginAsUserType(userType);
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
    @Then("user should see error message {string}")
    public void userShouldSeeErrorMessage(String message) {
        message= "Incorrect login or password";
        Assert.assertEquals("Not match",message,loginPage.errMessage.getText());
        System.out.println("Error message");
    }

    @When("users logging in with one empty text field {string},{string}")
    public void usersLoggingInWithOneEmptyTextField(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("user should see validation message {string}")
    public void userShouldSeeValidationMessage(String message) {
        message= "Please fill out this field";
        Assert.assertEquals("Not match",message,loginPage.errMessage.getText());
        System.out.println("Validation message");
    }

    @When("user is on the login page")
    public void userIsOnTheLoginPage() {
    }
    @Then("user sees {string} box")
    public void userSeesBox(String rememberMeText) {
        rememberMeText="Remember me on this computer";
        Assert.assertTrue("No element", loginPage.rememberMe.isDisplayed());
        loginPage.rememberMe.click();
        Assert.assertTrue("Not selected", loginPage.rememberMe.isSelected());
        Assert.assertTrue("No text",loginPage.rememberMeText.isDisplayed());
        System.out.println("Remember me box is present and clickable");

    }

    @Then("password should be masked")
    public void passwordShouldBeMasked() {
        Assert.assertEquals("negative","password", loginPage.attribute.getAttribute("type"));
        System.out.println("password masked");
    }
}

