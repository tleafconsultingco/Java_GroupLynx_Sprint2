package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ableToLoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @When("user enters HR{string} and {string}")
    public void userEntersHRAnd(String HR_username, String HR_password) {
        loginPage.login(ConfigurationReader.getProperty("hr_username"),ConfigurationReader.getProperty("hr_password"));
        System.out.println("HR login");
    }
    @And("entries should be masked in password field1")
    public void entriesShouldBeMaskedInPasswordField1() {
        Assert.assertEquals("negative","password", loginPage.attribute.getAttribute("type"));
        System.out.println("password masked");
    }
    @Then("user should land on the home page with HR {string}")
    public void userShouldLandOnTheHomePageWithHR(String expTitle1) {
        expTitle1="Portal";
        Assert.assertTrue("NO TITLE", Driver.getDriver().getTitle().contains(expTitle1));
    }

    @When("user enters Helpdesk{string} and {string}")
    public void userEntersHelpdeskAnd(String helpdesk_username, String helpdesk_password) {
        loginPage.login(ConfigurationReader.getProperty("helpdesk_username"),ConfigurationReader.getProperty("helpdesk_password"));
        System.out.println("Helpdesk login");
    }
    @And("entries should be masked in password field2")
    public void entriesShouldBeMaskedInPasswordField2() {
        Assert.assertEquals("negative","password", loginPage.attribute.getAttribute("type"));
        System.out.println("password masked");
    }
    @Then("user should land on the home page with Helpdesk {string}")
    public void userShouldLandOnTheHomePageWithHelpdesk(String expTitle2) {
        expTitle2="Portal";
        Assert.assertTrue("NO TITLE", Driver.getDriver().getTitle().contains(expTitle2));
    }

    @When("user enters Marketing {string} and {string}")
    public void userEntersMarketingAnd(String marketing_users, String marketing_password) {
        loginPage.login(ConfigurationReader.getProperty("marketing_users"),ConfigurationReader.getProperty("marketing_password"));
        System.out.println("Marketing login");
    }
    @And("entries should be masked in password field3")
    public void entriesShouldBeMaskedInPasswordField3() {
        Assert.assertEquals("negative","password", loginPage.attribute.getAttribute("type"));
        System.out.println("password masked");
    }
    @Then("user should land on the home page with Marketing {string}")
    public void userShouldLandOnTheHomePageWithMarketing(String expTitle3) {
        expTitle3="Portal";
        Assert.assertTrue("NO TITLE", Driver.getDriver().getTitle().contains(expTitle3));
    }
}


