package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Employees")
    public WebElement employeesPageBtn;

    @FindBy(xpath = "//span[.='Find Employee']")
    public WebElement findEmployeeMod;

    @FindBy(xpath = "//span[.='Telephone Directory']")
    public WebElement telephoneDirectoryMod;

    @FindBy(xpath = "//span[.='Staff Changes']")
    public WebElement staffChangesMod;

    @FindBy(xpath = "//span[.='Efficiency Report'][1]")
    public WebElement EfficiencyReportMod;

    @FindBy(xpath = "//span[.='Honored Employees'][1]")
    public WebElement HonoredEmployeesMod;

    @FindBy(xpath = "//span[.='Birthdays'][1]")
    public WebElement BirthdaysMod;

    @FindBy(xpath = "//span[.='New page'][1]")
    public WebElement newPageMod;

    @FindBy(xpath = "//span[.='More']")
    public WebElement Morebtn;



}
