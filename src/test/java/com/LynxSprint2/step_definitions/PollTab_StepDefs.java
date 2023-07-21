package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.PollTabPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Map;

public class PollTab_StepDefs {

    PollTabPage pollTabPage = new PollTabPage();


    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        pollTabPage.pollButton.click();

    }
    @Then("user sees All employees by default")
    public void user_sees_all_employees_by_default() {
        pollTabPage.allEmployeesBtn.isDisplayed();

    }

    @When("user clicks Add question")
    public void user_clicks_add_question() {
        pollTabPage.addQuestionBtn.click();

    }
    @When("user write {string} into the question field")
    public void user_write_into_the_question_field(String question) {
        pollTabPage.questionTab.sendKeys(question);

    }
    @When("user write the following answers")
    public void user_write_the_following_answers(Map<String, String> answers) {
        pollTabPage.answerTab1.sendKeys("");
        pollTabPage.answerTab2.sendKeys("");
    }
    @Then("user creates poll")
    public void user_creates_poll() {
        pollTabPage.sendButton.click();
    }

    @Then("user select Allow multiple choice")
    public void user_select_allow_multiple_choice() {
        pollTabPage.checkbox.click();

    }

    @Then("user sees {string} error message")
    public void user_sees_error_message(String expectedErrorMsg) {
        String actualErrorMsg = pollTabPage.errorMessage.getText();
        Assert.assertTrue(actualErrorMsg.equals(expectedErrorMsg));
    }

    @When("user clicks on {string} x button")
    public void user_clicks_on_x_button(String string) {
        pollTabPage.clickXButton.click();

    }

    @And("user write {string} to the answer field")
    public void userWriteToTheAnswerField(String answer) {
        pollTabPage.answerTab1.sendKeys(answer);
    }

    @When("user write {string} to the message field")
    public void user_write_to_the_message_field(String message) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        pollTabPage.messageText.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();


    }
    @And("user write {string} to the question field")
    public void userWriteToTheQuestionField(String question) {
        pollTabPage.questionTab.sendKeys(question);
    }


    @Then("user see The question {string} has no answers. error message")
    public void userSeeTheQuestionHasNoAnswersErrorMessage(String expectedErrorMsg) {
        String actualErrorMsg = pollTabPage.errorMessage.getText();
        Assert.assertTrue(actualErrorMsg.contains(expectedErrorMsg));
    }
}
