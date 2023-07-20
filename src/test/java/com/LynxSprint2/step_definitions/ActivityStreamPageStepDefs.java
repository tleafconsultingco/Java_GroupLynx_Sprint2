package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.ActivityStreamPage;
import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.contrib.For;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.sql.rowset.BaseRowSet;
import java.util.ArrayList;
import java.util.List;

public class ActivityStreamPageStepDefs {
LoginPage loginPage = new LoginPage();
    @Given("user is on the Activity stream page")
    public void userIsOnTheActivityStreamPage() {

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       loginPage.login("helpdesk1@cybertekschool.com", "UserUser");

    }


ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user is on the activity stream page")
    public void user_is_on_the_activity_stream_page() {

        activityStreamPage.activityStream.click();

    }


    @Then("user should see the {string},{string},{string}, {string}, {string} following options")
    public void userShouldSeeTheFollowingOptions(String messageEx, String taskEx, String eventEx, String pollEx, String moreEx) {

        String messageAct = activityStreamPage.message.getText();
        Assert.assertEquals(messageAct, messageEx);

        String taskAct = activityStreamPage.task.getText();
        Assert.assertEquals(taskAct, taskEx);

        String eventAct = activityStreamPage.event.getText();
        Assert.assertEquals(eventAct,eventEx);

        String pollAct = activityStreamPage.poll.getText();
        Assert.assertEquals(pollAct, pollEx);

        String moreAct = activityStreamPage.more.getText();
        Assert.assertEquals(moreAct, moreEx);

    }


    @When("user clicks on the more button")
    public void user_clicks_on_the_more_button() {

        activityStreamPage.more.click();

    }


    @Then("user should see the {string}, {string}, {string}, {string} following options")
    public void userShouldSeeTheFollowingOptions(String file, String appreciation, String announcement, String workflow) {

        String fileAct = activityStreamPage.file.getText();
        Assert.assertEquals(fileAct, file);

        String appreciationAct = activityStreamPage.appreciation.getText();
        Assert.assertEquals(appreciationAct, appreciation);

        String announcementAct = activityStreamPage.announcement.getText();
        Assert.assertEquals(announcementAct, announcement);

        String workFlowAct = activityStreamPage.workFlow.getText();
        Assert.assertEquals(workFlowAct, workflow);

        //something

    }

}
