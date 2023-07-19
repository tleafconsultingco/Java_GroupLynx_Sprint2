@login
Feature: User types logged in with valid credentials

  Background: User is already on the login page
    Given the user is on the login page

  Scenario Outline: Verify login with different user types

    When user is logged in as "<username>","<password>"
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |

  Scenario: Login as a Driver
    When The user logs in as a "Hr"
    Then The user is on the home page

  Scenario: Login as a Sales Manager
    When The user logs in as a "Helpdesk"
    Then The user is on the home page

  Scenario: Login as a Store Manager
    When The user logs in as a "Marketing"
    Then The user is on the home page