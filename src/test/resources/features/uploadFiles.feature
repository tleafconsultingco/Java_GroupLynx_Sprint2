@B29G26-272
Feature: Upload files and pictures feature

  User Story:
  As a user, I should be able to upload files and pictures as messages

  Acceptance Criteria:
  1. User should be able to upload file and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
  2. User should be able to insert the files and images into the text
  3. User should be able to remove files and images at any time before sending


  @B29G26-269
  Scenario Outline: User should be able to upload file and pictures.
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user clicks "Upload file" icon
    #And user clicks "Upload File Button"
    And user uploads the following files
      | message.txt |
    Then files or pictures are successfully uploaded
    Examples:
      | userType  |
      | hr        |
      #| helpdesk  |
      #| marketing |


  @B29G26-270
  Scenario: User inserts files and images into the text
    Given files or pictures are successfully uploaded
    When user clicks "Insert in text" button
    Then files or pictures are inserted in the message text box


  @B29G26-271
  Scenario: User removes files and images before sending
    Given files or pictures are inserted in the message text box
    When user clicks cancel button
    Then files or pictures are removed from message box