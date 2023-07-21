package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyStructurePage {

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //--LOCATORS

    //"Employees" menu button on the left side of page
    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeMenuButton;

    //page title when on the Employees page
    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;

    //"ADD DEPARTMENT" button
    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartmentButton;

    //--METHODS

    public void webElementsEmployeePage(){
        List<WebElement> addDepartmentButton = Driver.getDriver().findElements(By.xpath("//span[.='Add department']"));
        addDepartmentButton.size();
    }

}
