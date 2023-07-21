package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
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

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
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

    @FindBy (xpath = "(//span[@class='diskuf-label-icon'])[1]")
    public WebElement attachedFiles;



}
