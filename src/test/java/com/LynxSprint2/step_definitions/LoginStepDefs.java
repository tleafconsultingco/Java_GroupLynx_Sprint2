package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user logs in as {string}")
    public void user_logs_in_as(String username, String password) {
        loginPage.login(username,password);
    }

    @Given("user logs in as {string} user")
    public void user_logs_in_as_user(String userType) {
       loginPage.loginAsUserType(userType);
    }

    @Then("user is on the home page")
    public void user_is_on_the_home_page() {
    }
}

