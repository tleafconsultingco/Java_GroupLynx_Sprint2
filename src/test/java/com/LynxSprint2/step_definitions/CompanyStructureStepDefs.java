package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.CompanyStructurePage;
import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CompanyStructureStepDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginpage = new LoginPage();


    @Given("user is logged in with valid username and password")
    public void userIsLoggedInWithValidAnd() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
        loginpage.userName.sendKeys("hr1@cybertekschool.com");
        loginpage.password.sendKeys("UserUser");
        loginpage.submit.click();
        //loginpage.login("hr1@cybertekschool.com","UserUser");
    }

    @When("{string} is on the landing page")
    public void isOnTheLandingPage(String userType) {
    }

    @And("user clicks on Employees menu")
    public void userClicksOnEmployeesMenu() {
        companyStructurePage.employeeMenuButton.click();
    }

    @Then("user should see {string} displayed")
    public void userShouldSeeDisplayed(String titleHeader) {
        String actualTitle = companyStructurePage.pageTitle.getText();
        Assert.assertEquals(actualTitle,titleHeader);
    }

    @Given("the hr user is logged in as {string}, {string}")
    public void theHrUserIsLoggedInAs(String username, String password) {
        loginpage.login("hr1@cybertekschool.com","UserUser");
    }

    @Then("hr user should be able to add department")
    public void hrUserShouldBeAbleToAddDepartment() {
        companyStructurePage.addDepartmentButton.click();
    }

    @Then("user should not see Add Department option")
    public void userShouldNotSeeAddDepartmentOption() {
        //TODO: how to verify web element is not displayed?
    }
}
