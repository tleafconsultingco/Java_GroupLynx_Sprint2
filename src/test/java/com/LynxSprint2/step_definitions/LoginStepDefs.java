package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

   @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user is logged in as {string},{string}")
    public void theUserIsLoggedInAs(String username, String password) {
        loginPage.login(username,password);
    }

    @When("The user logs in as a {string}")
    public void theUserLogsInAsA(String userType) {
       loginPage.loginAsUserType(userType);
    }

    @Then("The user is on the home page")
    public void theUserIsOnTheHomePage() {
    }
}

