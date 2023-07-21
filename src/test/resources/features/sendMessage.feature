
Feature: Send Message Functionality

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


  Scenario Outline: Send message by filling the mandatory fields
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


  Scenario Outline: Send message by filling the mandatory fields
    Given user logs in as "<userType>"
    When user clicks "Message" tab
    And user clicks send button
    Then user gets -The message title is not specified- error message
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

@nilay
    Scenario Outline: The message delivery is to be 'All employees' by default.
      Given user logs in as "<userType>"
      When user clicks "Message" tab
      When user types message to Message Box
      Then user deliveries message to All employees by default.
    Examples:
    | userType  |
    | hr        |
    | helpdesk  |
    | marketing |