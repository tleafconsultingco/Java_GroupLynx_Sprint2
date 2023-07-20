package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.PollTabPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PollTab_StepDefs {

    PollTabPage pollTabPage = new PollTabPage();

    @Given("User is on CRM home page")
    public void user_is_on_crm_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String username, String password) {
        pollTabPage.login(ConfigurationReader.getProperty("hr_username"),ConfigurationReader.getProperty("hr_password"));
        }






    @When("User click Poll")
    public void user_click_poll() {
        pollTabPage.pollButton.click();
    }

    @Then("user sees All employees by default")
    public void user_sees_all_employees_by_default() {
        Assert.assertTrue(pollTabPage.allEmployeesBtn.isDisplayed());
    }
    @When("user clicks Add question")
    public void user_clicks_add_question() {
        pollTabPage.addQuestionBtn.click();

    }
    @Then("user write questions")
    public void user_write_questions() {
        pollTabPage.questionTab.sendKeys("question1");
    }
    @Then("user write multiples answers")
    public void user_write_multiples_answers() {
        pollTabPage.answerTab1.sendKeys("answer1");
        pollTabPage.answerTab2.sendKeys("answer2");
    }
    @Then("user select Allow multiple choice")
    public void user_select_allow_multiple_choice() {
        pollTabPage.allowMultChoiceCheckbox.click();
        pollTabPage.allowMultChoiceCheckbox.isSelected();
    }
    @When("user does not write message title")
    public void user_does_not_write_message_title() {
        pollTabPage.messageTitle.sendKeys("");
    }
    @When("click send button")
    public void click_send_button() {
        pollTabPage.sendButton.click();
    }

    @Then("user sees error message: The message title is not specified")
    public void user_sees_error_message_the_message_title_is_not_specified() {

        String expectedMessage = "The message title is not specified";
        String actualMessage = pollTabPage.errorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("user does not specified recipient")
    public void user_does_not_specified_recipient() {
        //pollTabPage.recipientLink.sendKeys("");
        pollTabPage.clickXButton.click();
        BrowserUtils.sleep(3);
        pollTabPage.sendButton.click();
    }

    @Then("user sees error message: Please specify at least one person.")
    public void user_sees_error_message_please_specify_at_least_one_person() {
        String expectedMsg = "Please specify at least one person.";
        String actualMsg = pollTabPage.errorMsg.getText();
        Assert.assertEquals(expectedMsg, actualMsg);
    }

    @When("user does not write a question")
    public void user_does_not_write_a_question() {
        pollTabPage.messageTitle.sendKeys("Cydeo");
        pollTabPage.messageText.sendKeys("Hello World");
        pollTabPage.answerTab1.sendKeys("Hello");
        pollTabPage.sendButton.click();
    }
    @Then("user sees error message: The question text is not specified.")
    public void user_sees_error_message_the_question_text_is_not_specified() {
        String expectedQErrorMsg = "The question text is not specified.";
        String actualQErrorMsg = pollTabPage.questionErrorMsg.getText();
        Assert.assertEquals(expectedQErrorMsg, actualQErrorMsg);
    }
    @When("the user does not write the answer")
    public void the_user_does_not_write_the_answer() {
        pollTabPage.messageTitle.sendKeys("Cydeo");
        pollTabPage.messageText.sendKeys("Hello World");
        pollTabPage.questionTab.sendKeys("How are you?");
        pollTabPage.sendButton.click();

    }

    @Then("user sees error message: The question {string} has no answers.")
    public void user_sees_error_message_the_question_has_no_answers(String string) {
        String expectedErrMsg = "The question" + string +" has no answers.";
        String actualErrMsg = pollTabPage.questionErrorMsg.getText();
        Assert.assertTrue(actualErrMsg.contains(expectedErrMsg));

    }


}
