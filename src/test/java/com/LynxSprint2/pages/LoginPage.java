package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //--LOCATORS--
    @FindBy(xpath = "//input[@type='password']")
    public WebElement attribute;
    @FindBy(xpath="//input[@name='USER_LOGIN']")
    public WebElement usernameField;
    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement passwordField;
    @FindBy(xpath="//input[@value='Log In']")
    public WebElement logInButton;

    //--METHODS--

    /*
    Log in with valid credentials
     */
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        BrowserUtils.sleep(3);
        logInButton.click();
        // verification that we logged
    }

    /*
    Log in as a specific userType
     */
    public void loginAsUserType(String userType){
        String username = "",
                password = "";

        if (userType.equalsIgnoreCase("Hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Helpdesk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("Marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        logInButton.click();
    }


}
