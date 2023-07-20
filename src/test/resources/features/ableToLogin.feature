@B29G26-254
Feature: User should be able to login

  Background: User is already on the login page
    Given the user is on the login page

  Scenario Outline: Verify login with different Valid credentials
    When users logging in with Valid "<username>","<password>"
    Then user should land on Home page with "title"
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |

  Scenario Outline: Verify login with inValid credentials
    When users logging in with inValid "<username>","<password>"
    Then user should see validation message "message"
    Examples:
      | username                 | password |
      | hr1@cybertekschool.com   | boxer    |
      | hxxxxxskybeyyyyyhool.com | UserUser |

