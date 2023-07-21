package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.SendAppreciationPage;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class SendAppreciationStepDefs {

    SendAppreciationPage sendAppreciationPage = new SendAppreciationPage();
    LoginPage loginPage = new LoginPage();
    @When("user clicks on More tab")
    public void user_clicks_on_tab() {
        sendAppreciationPage.moreTab.click();
    }
    @When("user clicks on Appreciation option")
    public void user_clicks_on_option() {
        sendAppreciationPage.appreciationOption.click();
    }
    @When("user provides message title")
    public void user_provides_message_title() {
        Driver.getDriver().switchTo().frame(sendAppreciationPage.iframeMessageBox);
        sendAppreciationPage.messageBoxInput.sendKeys("You are beautiful");
        Driver.getDriver().switchTo().defaultContent();
    }
    @When("user add a recipient using Add employees button")
    public void user_add_a_recipient_using_button() {
        sendAppreciationPage.addEmployeeButton.click();
        sendAppreciationPage.employeeSelection.click();
    }
    @When("user clicks SEND button")
    public void user_clicks_button() {
        sendAppreciationPage.sendButton.click();
    }

    @Then("user should see new message on Activity Stream")
    public void user_should_see_new_message_on() {
    }

    @When("user logs in with following credentials \\(Map)")
    public void userLogsInWithFollowingCredentialsMap(Map<String,String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        loginPage.login(username,password);
    }


}
