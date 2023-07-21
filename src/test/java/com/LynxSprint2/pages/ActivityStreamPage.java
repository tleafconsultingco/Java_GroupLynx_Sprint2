package com.LynxSprint2.pages;

import com.LynxSprint2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement message;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']/span")
    public WebElement task;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']/span")
    public WebElement event;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']/span")
    public WebElement poll;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement more;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']")
    public WebElement followingOptions;

    @FindBy(xpath = "//span[text()='File']")
    public WebElement file;

    @FindBy(xpath = "//span[text()='Appreciation']")
    public WebElement appreciation;

    @FindBy(xpath = "//span[text()='Announcement']")
    public WebElement announcement;

    @FindBy(xpath = "//span[text()='Workflow']")
    public WebElement workFlow;

  /*  public void activityStreamOptions(String options){
        
        if (options.equalsIgnoreCase("message")){

            Assert.assertTrue(message.isDisplayed());
            
        } else if () {


        }


    }

 */
   //something funny






}

