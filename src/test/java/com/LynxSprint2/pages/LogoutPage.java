package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutPage {


    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//span[@id=\"user-name\"]")
    public WebElement userNameButton;

    @FindBy(xpath="//span[text()=\"My Profile\"]")
    public WebElement myProfile;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton;

    @FindBy (xpath = "//div[@class=\"menu-popup-items\"]//a")
    public List<WebElement> profile_edit_logout;

    @FindBy(xpath = "(//span[.=\"Themes\"])[2]")
    public WebElement teamButton;

    @FindBy(xpath = "(//span[.=\"Configure notifications\"])[2]")
    public WebElement config;






}
