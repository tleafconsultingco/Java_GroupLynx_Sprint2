package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Employees")
    public WebElement employeesPageBtn;

    @FindBy(xpath = "//div[@data-text='Company Structure']" )
    public WebElement companyStructureMod;

    @FindBy(xpath = "//div[@data-text='Find Employee']")
    public WebElement findEmployeeMod;

    @FindBy(xpath = "//div[@data-text='Telephone Directory']")
    public WebElement telephoneDirectoryMod;

    @FindBy(xpath = "//div[@data-text='Staff Changes']")
    public WebElement staffChangesMod;

    @FindBy(xpath = "//div[@data-text='Efficiency Report']")
    public WebElement EfficiencyReportMod;

    @FindBy(xpath = "//div[@data-text='Honored Employees']")
    public WebElement HonoredEmployeesMod;

    @FindBy(xpath = "//div[@data-text='Birthdays']")
    public WebElement BirthdaysMod;

    @FindBy(xpath = "//div[@data-text='New page']")
    public WebElement newPageMod;

    public String getDefaultModule(){
        WebElement defaultModuleElement = companyStructureMod;
        return defaultModuleElement.getText();
    }

    private WebDriver driver;

    public EmployeesPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getVisibleModules(){
        List<String> visibleModules = new ArrayList<>();

        List<WebElement> moduleElements = driver.findElements(By.cssSelector("main-buttons-item-link"));

        for(WebElement moduleElement : moduleElements){
            if (moduleElement.isDisplayed()){
                visibleModules.add(moduleElement.getText());
            }
        }
        return visibleModules;
    }







}
