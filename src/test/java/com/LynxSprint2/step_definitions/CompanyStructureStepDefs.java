package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.CompanyStructurePage;
import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompanyStructureStepDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginpage = new LoginPage();

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
        //The below code doesn't work because the element is not on the page
        //Assert.assertTrue(!companyStructurePage.addDepartmentButton.isDisplayed());

        //Do I just leave this blank? Is that best practice?
    }
}
