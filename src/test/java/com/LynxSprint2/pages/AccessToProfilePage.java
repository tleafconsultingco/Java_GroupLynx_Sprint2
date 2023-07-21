package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessToProfilePage {

    public AccessToProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//span[@id=\"user-name\"]")
    public WebElement userNameButton;

    @FindBy(xpath="//span[text()=\"My Profile\"]")
    public WebElement myProfile;

    @FindBy(xpath="//span[@id=\"pagetitle\"]")
    public WebElement pgeTitle;

/*
    @FindBy(xpath="//a[.=\"General\"]")
    public WebElement generalButton;

    @FindBy(xpath="//a[.=\"Drive\t\t\t\t\t\t\"]")
    public WebElement driverButton;

    @FindBy(xpath="//a[.=\"Tasks\t\t\t\t\t\t\"]")
    public WebElement tasksButton;

    @FindBy(xpath="//a[.=\"Calendar\t\t\t\t\t\t\"]")
    public WebElement calendarButton;

    @FindBy(xpath="//a[.=\"Conversations\t\t\t\t\t\t\"]")
    public WebElement conversationsButton;
*/


   @FindBy(xpath="//div[@id=\"profile-menu-filter\"]//a")
    public List<WebElement> elements;


}
