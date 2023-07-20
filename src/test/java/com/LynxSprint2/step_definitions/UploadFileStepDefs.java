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
import org.openqa.selenium.By;

import java.util.List;

public class UploadFileStepDefs {
    LoginPage loginPage = new LoginPage();
    MessagePage messagePage = new MessagePage();


    @When("user clicks {string} tab")
    public void userClicksTab(String moduleName) {
        Driver.getDriver().findElement(By.xpath("(//span[.='"+ moduleName +"'])[2]")).click();
        //messagePage.messageTab.click();
    }

    @And("user clicks {string} icon")
    public void userClicksIcon(String Icon) {
        //Driver.getDriver().findElement(By.xpath("//span[@title='"+ Icon +"']")).click();
       // Driver.getDriver().findElement(By.xpath("//div[@id='post-buttons-bottom']//span")).click();

        BrowserUtils.sleep(2);
        messagePage.addFileButton.click();
    }

    @When("user uploads the following files")
    public void userUploadsTheFollowingFiles(List<String> fileName) {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/filesToUpload/message.txt";
        String fullPath = projectPath + "/" + filePath;
        messagePage.uploadFileButton.sendKeys(fullPath);
        BrowserUtils.sleep(2);
    }


    @Then("files or pictures are successfully uploaded")
    public void filesOrPicturesAreSuccessfullyUploaded() {
    }



}
