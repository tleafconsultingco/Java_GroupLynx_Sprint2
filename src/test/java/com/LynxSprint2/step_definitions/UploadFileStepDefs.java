package com.LynxSprint2.step_definitions;

import com.LynxSprint2.pages.LoginPage;
import com.LynxSprint2.pages.MessagePage;
import com.LynxSprint2.utilities.ConfigurationReader;
import com.LynxSprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFileStepDefs {

    UploadFileStepDefs uploadFileStepDefs = new UploadFileStepDefs();
    LoginPage loginPage = new LoginPage();


    @Given("the user is on the message composition page")
    public void the_user_is_on_the_message_composition_page() {

    }


    @When("the user selects a valid file or picture to upload")
    public void the_user_selects_a_valid_file_or_picture_to_upload() {

    }

    @Then("the file or picture should be successfully uploaded")
    public void the_file_or_picture_should_be_successfully_uploaded() {

    }

    @Given("the user is composing a message")
    public void the_user_is_composing_a_message() {

    }

    @When("the user inserts a file or image into the text")
    public void the_user_inserts_a_file_or_image_into_the_text() {

    }

    @Then("the file or image should be displayed in the message text")
    public void the_file_or_image_should_be_displayed_in_the_message_text() {

    }

    @Given("the user has inserted a file or image in the message text")
    public void the_user_has_inserted_a_file_or_image_in_the_message_text() {

    }

    @When("the user removes the file or image")
    public void the_user_removes_the_file_or_image() {

    }

    @Then("the file or image should no longer be displayed in the message text")
    public void the_file_or_image_should_no_longer_be_displayed_in_the_message_text() {

    }


}
