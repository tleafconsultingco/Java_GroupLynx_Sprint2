package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.CompanyStructurePage;
import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompanyStructureStepDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginpage = new LoginPage();


    @When("user is logged in with valid username and password")
    public void userIsLoggedInWithValidAnd() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
        loginpage.usernameField.sendKeys("hr1@cybertekschool.com");
        loginpage.passwordField.sendKeys("UserUser");
        loginpage.logInButton.click();
        //loginpage.login("hr1@cybertekschool.com","UserUser");
    }

    @When("user logs in with {string},{string}")
    public void theUserIsLoggedInAs(String username, String password) {
        loginpage.login(username,password);
    }

    @And("{string} is on the landing page")
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

    @When("the hr user is logged in as {string}, {string}")
    public void theHrUserIsLoggedInAs(String username, String password) {
        loginpage.login(username,password);
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
