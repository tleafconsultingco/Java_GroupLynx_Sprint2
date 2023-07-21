package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.MessagePage;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SendMessageStepDefs {

    MessagePage messagePage=new MessagePage();
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

   @When("user types message to Message Box")
    public void user_types_message_to_message_box() throws InterruptedException {
    Driver.getDriver().switchTo().frame(messagePage.MessageBox);
    messagePage.MessageBox1.sendKeys("Hello World");
    Thread.sleep(5000);
    Driver.getDriver().switchTo().parentFrame();

    }


   // @When("user click All employees in To Box")
    //public void user_click_all_employees_in_to_box() {
    //    messagePage.AllEmployee.click();

    @When("user deletes recipients in To Box")
    public void user_deletes_recipients_in_to_box() {
        messagePage.AllEmployeeDeleteBut.click();

    }

    @Then("user gets -Please specify at least one person- error message")
    public void user_gets_please_specify_at_least_one_person_error_message() {
        Assert.assertTrue(messagePage.ErrorMsgForNoRecipient.isDisplayed());
    }

    @Then("user gets -The message title is not specified- error message")
    public void user_gets_the_message_title_is_not_specified_error_message() {
Assert.assertTrue(messagePage.ErrorMsgForNoMsg.isDisplayed());
    }




}







