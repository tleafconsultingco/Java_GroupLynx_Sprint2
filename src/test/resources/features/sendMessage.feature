Feature: Send Message Functionality

  User Story:As a user, I should be able to send messages by clicking on Message tab under Active Stream.
  Acceptance Criteria:
  1. User should be able to send a message by filling in the mandatory fields.

  Error messages for mandatory fields:
  "The message title is not specified."
  "Please specify at least one person."

  2. The message delivery should be to 'All employees' by default.
  3. User should be able to cancel sending messages at any time before sending.


  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Send message validation
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user types message to Message Box
    And user clicks send button

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: Send message by filling the mandatory fields validation (The recipients of email can not be empty )
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    When user types message to Message Box
    And user deletes recipients in To Box
    And user clicks send button
    Then user gets -Please specify at least one person- error message
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: Send message by filling the mandatory fields validation (Email text field can not be empty)
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user clicks send button
    Then user gets -The message title is not specified- error message
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: The message delivery is to be 'All employees' by default validation
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    When user types message to Message Box
    Then user deliveries message to All employees by default.
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @nilay
  Scenario Outline: Cancel sending messages at any time before sending.
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    When user types message to Message Box
    Then user cancels sending message any time before sending.
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |