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
    And user clicks Upload files icon
    Then user uploads the following files
      | message.txt                |
      | sprint2.png                |
      | Test_Case_Writing_Tips.pdf |
    Examples:
      | userType |
      | hr       |
      | helpdesk  |
      | marketing |


  @B29G26-270
  Scenario Outline: User should be able to insert the files and images into the text.
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user clicks Upload files icon
    And user uploads the following files
      | message.txt                |
      | sprint2.png                |
      | Test_Case_Writing_Tips.pdf |
    And user clicks Insert in text button
    Then files or pictures are inserted in the message text box
    Examples:
      | userType |
      | hr       |
      | helpdesk  |
      | marketing |


  @B29G26-271
  Scenario Outline: User should be able to remove files and images at any time before sending.
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user clicks Upload files icon
    And user uploads the following files
      | message.txt                |
      | sprint2.png                |
      | Test_Case_Writing_Tips.pdf |
    And user clicks Insert in text button
    And files or pictures are inserted in the message text box
    And user clicks cancel button
    Then files or pictures are removed from message box
    Examples:
      | userType |
      | hr       |
      | helpdesk  |
      | marketing |