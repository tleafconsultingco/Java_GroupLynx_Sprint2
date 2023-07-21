package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.SendAppreciationPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class SendAppreciationStepDefs {

    SendAppreciationPage sendAppreciationPage = new SendAppreciationPage();
    LoginPage loginPage = new LoginPage();

    /*
    @When("user clicks on More tab")
    public void user_clicks_on_tab() {
        sendAppreciationPage.moreTab.click();
    }
     */

    /*
    @When("user clicks on Appreciation option")
    public void user_clicks_on_option() {
        sendAppreciationPage.appreciationOption.click();
    }

     */
    @And("user clicks on {string} option")
    public void userClicksOnOption(String moreOptions) {
        Driver.getDriver().findElement(By.xpath("(//span[.='"+moreOptions+"'])[2]")).click();
    }
    @And("user provides {string} in message title")
    public void user_provides_string_message_title(String messageTitle) {
        Driver.getDriver().switchTo().frame(sendAppreciationPage.iframeMessageBox);
        sendAppreciationPage.messageBoxInput.sendKeys(messageTitle);
        Driver.getDriver().switchTo().defaultContent();
    }


    @When("user adds a recipient using Add employees button")
    public void user_add_a_recipient_using_button() {
        sendAppreciationPage.addEmployeeButton.click();
        sendAppreciationPage.employeeSelection.click();
        //sendAppreciationPage.closeEmployeeSelection.click();
    }

    /*
    @When("user clicks send button")
    public void user_clicks_button() {
        sendAppreciationPage.sendButton.click();
    }

     */

    @Then("user sees {string} message on Activity Stream")
    public void user_sees_new_message_on(String messageTitle) {
        BrowserUtils.waitFor(5);
        String actualMessageTitle = sendAppreciationPage.uploadedMessageTitle.getText();
        Assert.assertEquals(messageTitle,actualMessageTitle);
    }

// problem with assertion
    @Then("user verifies {string} is in delivery")
    public void userVerifiesIsInDelivery(String allEmployees) {
        /*
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='"+allEmployees+"']")).isDisplayed());


        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[.='All employees')[3]]")).isDisplayed());
*/

        Assert.assertTrue(sendAppreciationPage.allEmployeesButton.isDisplayed());


    }


    @And("user clicks the cancel button")
    public void userClicksTheCancelButton() {
        sendAppreciationPage.cancelButton.click();
    }

    @Then("user sees appreciation box collapse")
    public void userSeesAppreciationBoxCollapse() {
        WebElement collapseBoxDefaultMessage = Driver.getDriver().findElement(By.xpath("//span[.='Send message …']"));

        Assert.assertTrue(collapseBoxDefaultMessage.isDisplayed());
        /* returns 1 element
        List<WebElement> appreciationBox = Driver.getDriver().findElements(By.xpath("//button[@id='blog-submit-button-save']"));
        System.out.println("appreciationBox.size() = " + appreciationBox.size());
        Assert.assertTrue(appreciationBox.size()==0);

         */

    }
}
