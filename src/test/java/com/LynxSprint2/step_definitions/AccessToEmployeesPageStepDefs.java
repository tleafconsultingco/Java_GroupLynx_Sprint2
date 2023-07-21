package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.EmployeesPage;
import com.LynxSprint2.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccessToEmployeesPageStepDefs {

    EmployeesPage employeesPage = new EmployeesPage();
    LoginPage loginpage = new LoginPage();

    @Then("I should be redirected to the Company Structure page")
    public void i_should_be_redirected_to_the_company_structure_page() {
        WebDriver driver = new ChromeDriver();
        String expectedPageTitle = "Company Structure";
        String actualPageTitle = driver.getTitle();
        org.junit.Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }


    @Given("I am on the Employees page")
    public void i_am_on_the_employees_page() {

        employeesPage.employeesPageBtn.click();

    }

    @Then("I should see the following  modules:")
    public void i_should_see_the_following_modules() {



               Assert.assertTrue(employeesPage.telephoneDirectoryMod.isDisplayed());
               Assert.assertTrue(employeesPage.findEmployeeMod.isDisplayed());
               Assert.assertTrue(employeesPage.staffChangesMod.isDisplayed());
               Assert.assertTrue(employeesPage.HonoredEmployeesMod.isDisplayed());
               Assert.assertTrue(employeesPage.EfficiencyReportMod.isDisplayed());
               Assert.assertTrue(employeesPage.HonoredEmployeesMod.isDisplayed());
               Assert.assertTrue(employeesPage.BirthdaysMod.isDisplayed());
               Assert.assertTrue(employeesPage.newPageMod.isDisplayed());





    }





   /* @Given("I am on the Employees page")
    public void i_am_on_the_employees_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    */
   /* @When("I click on the Employees Module")
    public void i_click_on_the_employees_module() {



        employeesPage.employeesPageBtn.click();

    }

    */




}
