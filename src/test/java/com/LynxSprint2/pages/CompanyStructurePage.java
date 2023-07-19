package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeMenuButton;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;

    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartmentButton;

}
