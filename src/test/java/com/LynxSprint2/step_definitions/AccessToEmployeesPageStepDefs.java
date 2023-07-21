package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.EmployeesPage;
import com.LynxSprint2.pages.LoginPage;
import io.cucumber.java.en.And;
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



    @When("user clicks on the Employees module")
    public void userClicksOnTheEmployeesModule() {

        employeesPage.employeesPageBtn.click();

    }


    @Then("the following modules should be visible on the Employees page:")
    public void theFollowingModulesShouldBeVisibleOnTheEmployeesPage() {

        List<String> expectedModules = Arrays.asList(
                "Company Structure",
                "Find Employee",
                "Telephone Directory",
                "Staff Changes",
                "Efficiency Report",
                "Honored Employees",
                "Birthdays",
                "New page"
        );

        List<String> visibleModules = employeesPage.getVisibleModules();

        for (String module : expectedModules){
            Assert.assertTrue("Module " + module + " should be visible.", visibleModules.contains(module));
        }



       /* Assert.assertTrue(employeesPage.telephoneDirectoryMod.isDisplayed());
        Assert.assertTrue(employeesPage.findEmployeeMod.isDisplayed());
        Assert.assertTrue(employeesPage.staffChangesMod.isDisplayed());
        Assert.assertTrue(employeesPage.HonoredEmployeesMod.isDisplayed());
        Assert.assertTrue(employeesPage.EfficiencyReportMod.isDisplayed());
        Assert.assertTrue(employeesPage.companyStructureMod.isDisplayed());
        Assert.assertTrue(employeesPage.BirthdaysMod.isDisplayed());
        Assert.assertTrue(employeesPage.newPageMod.isDisplayed());

        */

    }



    @Then("user should see the Company Structure module as the default view")
    public void userShouldSeeTheCompanyStructureModuleAsTheDefaultView() {

      String defaultModule = employeesPage.getDefaultModule();
      Assert.assertEquals("Company Structure should be the default module", "Company Structure", defaultModule);


       /* WebDriver driver = new ChromeDriver();
        String defaultModule = driver.getTitle();
        Assert.assertTrue("Company Structure should be the default module", defaultModule.equals("Company Structure"));

        */
    }

}
