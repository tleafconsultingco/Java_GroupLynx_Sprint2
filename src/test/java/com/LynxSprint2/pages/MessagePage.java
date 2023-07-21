package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
    public MessagePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;
    //message button to expand message tab

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textInput;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
     public WebElement linkText;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath="//iframe[@class='bx-editor-iframe']")
    public WebElement MessageBox;

    @FindBy (xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement addFileButton;
    //button to add file

    @FindBy (xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]")
    public WebElement uploadFileButton;
    //button to upload a file from directory

    @FindBy (xpath = "//span[text()='Insert in text']")
    public WebElement insertInTextButton;
    //button to insert a file into message tab

    @FindBy (xpath = "//span[text()='In text']")
    public WebElement inText;
    //confirmation that file is uploaded into message tab

    @FindBy (xpath = "//span[@class='del-but']")
    public WebElement cancelFileUpload;
    //button to cancel file upload

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner']//a)[1]")
    public WebElement clickTitle;

    @FindBy (xpath="//body[@contenteditable='true']")
    public WebElement MessageBox1;

    @FindBy (xpath = "//span[.='To all employees']")
    public WebElement ToAllEmployees;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement AllEmployeeDeleteBut;

    @FindBy (xpath = "//span[.='Please specify at least one person.']")
    public WebElement ErrorMsgForNoRecipient;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement ErrorMsgForNoMsg;

    @FindBy(xpath="//span[@id='feed-post-more-3419']")
    public WebElement MoreButtonForMsg;

    @FindBy(xpath="//span[.='Delete']")
    public WebElement DeleteButtonForMsg;

    @FindBy (xpath="//button[@id='blog-submit-button-cancel']")
    public WebElement CancelButton;











}
