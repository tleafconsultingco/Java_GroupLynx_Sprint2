package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.MessagePage;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendMessageStepDefs {

    MessagePage messagePage=new MessagePage();
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Given("user clicks Message Tab")
    public void user_clicks_message_tab() {

    }
    @When("user types message to Message Box")
    public void user_types_message_to_message_box() {

    }
    @When("user click All Employees in To Box")
    public void user_click_all_employees_in_to_box() {

    }
    @Then("user sends the message")
    public void user_sends_the_message() {

    }

}
