package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollTabPage {

    public PollTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//input[@name='USER_LOGIN']")
    public WebElement userName;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement passWord;

    @FindBy(xpath="//input[@value='Log In']")
    public WebElement submit;
    public void login(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        submit.click();
    }


    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollButton;


    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployeesBtn ;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionBtn;

    @FindBy(xpath = "//*[@id='question_1']")
    public WebElement questionTab;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answerTab1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answerTab2;

    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement allowMultChoiceCheckbox;

    @FindBy(xpath = "//*[@id='POST_TITLE']")
    public WebElement messageTitle;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement clickXButton;

    @FindBy(xpath = "//span[text()='Please specify at least one person.']")
    public WebElement errorMsg;


    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[.='Add persons, groups or department'])[1]")
    public WebElement recipientLink;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageText;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement questionErrorMsg;

}
