@B29G26-254
Feature: User should be able to login

  Background: User is already on the login page
    Given the user is on the login page

  Scenario Outline: Verify login with different Valid credentials
    When users logging in with Valid credentials "<userType>"
    Then user should land on Home page with "title"
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify login with inValid credentials
    When users logging in with inValid "<username>","<password>"
    Then user should see error message "message"
    Examples:
      | username                 | password |
      | hr1@cybertekschool.com   | boxer    |
      | hxxxxxskybeyyyyyhool.com | UserUser |

  Scenario Outline: Verify login with one empty field
    When users logging in with one empty text field "<username>","<password>"
    Then user should see validation message "message"
    Examples:
      | username               | password |
      | hr1@cybertekschool.com |          |
      |                        | UserUser |

  Scenario: Verify "Remember me..." box is in the place and is clickable
    When user is on the login page
    Then user sees "rememberMe" box

