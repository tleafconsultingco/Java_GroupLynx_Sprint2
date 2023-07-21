package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.BrowserUtils;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //--LOCATORS--
    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeText;
    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public WebElement rememberMe;
    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errMessage;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement attribute;
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameField;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordField;
    @FindBy(xpath = "//input[@value='Log In']")
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
    public void loginAsUserType(String userType) {

        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        logInButton.click();

    }


}
