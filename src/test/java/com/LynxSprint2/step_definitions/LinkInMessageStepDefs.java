package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.MessagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkInMessageStepDefs {

    MessagePage messagePage = new MessagePage();

    @When("user clicks the message button")
    public void user_clicks_the_message_button() {
      messagePage.messageTab.click();
    }
    @When("user clicks the link button")
    public void user_clicks_the_link_button() {
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


    @Then("user should see message with link")
    public void userShouldSeeMessageWithLink() {
        
    }
/*
    @And("user clicks the link in new message")
    public void userClicksTheLinkInNewMessage() {
        // double check with leena 
    }

    @Then("user verify URL")
    public void userVerifyURL() {
     
       
    }
    
 */
}
