
@nilay
Feature: Send Message Functionality

  Background: User is already in the log in page
    Given the user is on the login page

    Scenario Outline: Send message validation
      Given user logs in as "<userType>"
      When user clicks "Message" tab
      And user types "Hello World" to Message Box
      And user click "All Employees" in To Box
      And user clicks send button
      Then user sends the message
      Examples:
        | userType  |
        | hr       |
        | helpdesk |
        | marketing |



