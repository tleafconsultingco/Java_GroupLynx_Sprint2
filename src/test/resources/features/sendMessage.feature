
@nilay
Feature: Send Message Functionality

  Background: User is already in the log in page
    Given the user is on the login page

    Scenario Outline: Send message validation
      Given user logs in as "<userType>"
      And user clicks Message Tab
      When user types message to Message Box
      And user click All Employees in To Box
      And user clicks send button
      Then user sends the message
      Examples:
        | userType  |
        | hr1       |
        | helpdesk1 |
        | marketing |



