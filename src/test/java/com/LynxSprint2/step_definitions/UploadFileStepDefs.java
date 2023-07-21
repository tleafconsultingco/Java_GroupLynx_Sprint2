package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.MessagePage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.output.BrokenWriter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UploadFileStepDefs {
    LoginPage loginPage = new LoginPage();
    MessagePage messagePage = new MessagePage();


    @When("user clicks {string} tab")
    public void userClicksTab(String moduleName) {
        Driver.getDriver().findElement(By.xpath("(//span[.='" + moduleName + "'])[2]")).click();
        //messagePage.messageTab.click();
    }

    @And("user clicks Upload files icon")
    public void userClicksUploadFilesIcon() {
        // Driver.getDriver().findElement(By.xpath("//span[@title='"+ Icon +"']")).click();
        BrowserUtils.sleep(2);
        messagePage.addFileButton.click();
    }

    @When("user uploads the following files")
    public void userUploadsTheFollowingFiles(List<String> fileName) {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/filesToUpload/message.txt";
        String filePath2 = "src/test/resources/filesToUpload/sprint2.png";
        String filePath3 = "src/test/resources/filesToUpload/Test_Case_Writing_Tips.pdf";

        String fullPath = projectPath + "/" + filePath;
        String fullPath2 = projectPath + "/" + filePath2;
        String fullPath3 = projectPath + "/" + filePath3;


        messagePage.uploadFileButton.sendKeys(fullPath);
        messagePage.uploadFileButton.sendKeys(fullPath2);
        messagePage.uploadFileButton.sendKeys(fullPath3);
        BrowserUtils.sleep(2);
    }

    @When("user clicks Insert in text button")
    public void userClicksInsertInTextButton() {
        messagePage.insertInTextButton.click();
        messagePage.insertInTextButton.click();
        messagePage.insertInTextButton.click();
    }

    @Then("files or pictures are inserted in the message text box")
    public void filesOrPicturesAreInsertedInTheMessageTextBox() {
        String actualText = messagePage.inText.getText();
        String expectedText = "In text";
        Assert.assertEquals(expectedText, actualText);
    }

    @When("user clicks cancel button")
    public void userClicksCancelButton() {
        BrowserUtils.sleep(3);
        messagePage.cancelFileUpload.click();
        messagePage.cancelFileUpload.click();
        messagePage.cancelFileUpload.click();
        BrowserUtils.sleep(1);
    }

    @Then("files or pictures are removed from message box")
    public void filesOrPicturesAreRemovedFromMessageBox() {
        By buttonLocator = By.xpath("//span[text()='In text']");
        try {
            BrowserUtils.waitForInvisibilityOf(messagePage.inText);
            Assert.assertFalse(messagePage.inText.isDisplayed());
        } catch (NoSuchElementException e) {
            // If the button is not found, consider it as already disappeared (desired state)
            // Test passed!
        }

    }
}
