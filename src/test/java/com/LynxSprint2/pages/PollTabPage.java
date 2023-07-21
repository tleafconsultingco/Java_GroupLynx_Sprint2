package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollTabPage {

    public PollTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollButton;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployeesBtn ;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionBtn;

    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement questionTab;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answerTab1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answerTab2;

    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement checkbox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement clickXButton;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement messageText;


}
