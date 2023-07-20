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

    @FindBy (xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileButton;
    //button to upload a file from directory

    @FindBy (xpath = "//span[@id='check-in-text-n2863']")
    public WebElement insertInTextButton;
    //button to insert a file into message tab

    @FindBy (xpath = "//span[text()='In text']")
    public WebElement inText;
    //confirmation that file is uploaded into message tab

    @FindBy (xpath = "//span[@class='del-but']")
    public WebElement cancelFileUpload;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner']//a)[1]")
    public WebElement clickTitle;










}
