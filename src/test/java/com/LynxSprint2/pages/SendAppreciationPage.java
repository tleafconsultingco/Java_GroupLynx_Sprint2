package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendAppreciationPage {

    public SendAppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //--LOCATORS

    @FindBy(id="feed-add-post-form-link-text")
    public WebElement moreTab;
    @FindBy(xpath="(//span[.='Appreciation'])[2]")
    public WebElement appreciationOption;
    @FindBy(xpath="//iframe[@class='bx-editor-iframe']")
    public WebElement iframeMessageBox;
    @FindBy(xpath="//body[@contenteditable=\"true\"]")
    public WebElement messageBoxInput;
    @FindBy(id="bx-grat-tag")
    public WebElement addEmployeeButton;
    @FindBy(xpath="//a[@rel='U791']")
    public WebElement employeeSelection;
    @FindBy(xpath="//span[@class='popup-window-close-icon']")
    public WebElement closeEmployeeSelection;

    @FindBy(xpath="//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployeesButton;

    @FindBy(xpath="//button[@id='blog-submit-button-save']")
    public WebElement sendButton;
    @FindBy(id="blog-submit-button-cancel")
    public WebElement cancelButton;
    @FindBy(xpath="//div[contains(@id,'blog_post_body_')]")
    public WebElement uploadedMessageTitle;


}
