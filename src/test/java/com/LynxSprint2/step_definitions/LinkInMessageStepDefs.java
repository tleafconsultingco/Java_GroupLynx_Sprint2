package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.MessagePage;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.Set;

public class LinkInMessageStepDefs {

    MessagePage messagePage = new MessagePage();



    @And("user clicks the message button")
    public void userClicksTheMessageButton() {
        messagePage.messageTab.click();
    }

    @And("user clicks the link button")
    public void userClicksTheLinkButton() {
        messagePage.linkButton.click();
    }

    @When("user types {string} in text box")
    public void user_types_in_text_box(String string) {
    messagePage.textInput.sendKeys(string);

    }
    @When("user types {string} in link box")
    public void user_types_in_link_box(String string) {
       messagePage.linkText.sendKeys(string);

    }
    @When("user clicks save button")
    public void user_clicks_save_button() {
        messagePage.saveButton.click();

    }
    @When("user clicks send button")
    public void user_clicks_send_button() {
        messagePage.sendButton.click();

    }

    @And("user sees message with link")
    public void userSeesMessageWithLink() {
    }


    @And("user clicks the link in new message")
    public void userClicksTheLinkInNewMessage() throws InterruptedException {
        Thread.sleep(1000);
     messagePage.clickTitle.click();
    }

    @Then("user verify {string} URL")
    public void userVerifyURL(String url) {
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        Set<String> allHandles = Driver.getDriver().getWindowHandles();
        for(String handle : allHandles){
            if(!handle.equals(mainWindowHandle)){
                Driver.getDriver().switchTo().window(handle);
                break;
            }

        }
        String titleOfNewTab = Driver.getDriver().getTitle();
        String expectedTitle = url;
        Assert.assertTrue(titleOfNewTab.equals(expectedTitle));


        System.out.println("Expected Title: " + expectedTitle + "\n Actual Title: " + titleOfNewTab);
    }











}
