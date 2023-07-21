@B29G26-254
Feature: User should be able to login

  Background: User is already on the login page
    Given user is on the login page

  @B29G26-273
  Scenario Outline: Verify login with different Valid credentials
    When users logging in with Valid credentials "<userType>"
    Then user should land on Home page with "Portal" in title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @B29G26-274
  Scenario Outline: Verify login with inValid credentials
    When users logging in with inValid "<username>","<password>"
    Then user should see error message "Incorrect login or password"
    Examples:
      | username                 | password |
      | hr1@cybertekschool.com   | boxer    |
      | hxxxxxskybeyyyyyhool.com | UserUser |

  @B29G26-275
  Scenario Outline: Verify login with one empty field
    When users logging in with one empty text field "<username>","<password>"
    Then user should see validation message "Please fill out this field"
    Examples:
      | username               | password |
      | hr1@cybertekschool.com |          |
      |                        | UserUser |

  @B29G26-276
  Scenario: Verify "Remember me..." box is in the place and is clickable
    When user is on the login page
    Then user sees "rememberMe" box
    And user verify RememberMe checkbox is clickable

  @B29G26-277
    Scenario: Verify password masked
      When user is on the login page
      Then password should be masked


