package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.CompanyStructurePage;
import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompanyStructureStepDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginpage = new LoginPage();

    @And("user clicks on {string} menu")
    public void userClicksOnMenu(String menuName) {
        Driver.getDriver().findElement(By.xpath("//a[@title='"+menuName+"']")).click();
    }

    @Then("user sees {string} displayed")
    public void userSeesDisplayed(String titleHeader) {
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
        Assert.assertTrue(companyStructurePage.addDepartmentButton.isDisplayed());

    }

    @Then("user should not see Add Department option")
    public void userShouldNotSeeAddDepartmentOption() {
        List<WebElement> addDepartmentButton = Driver.getDriver().findElements(By.xpath("//span[.='Add department']"));
        System.out.println("addDepartmentButton.size() = " + addDepartmentButton.size());
        Assert.assertTrue(addDepartmentButton.size()==0);
    }

}
