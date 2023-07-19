@login @wip
Feature: User types logged in with valid credentials

  Background: User is already on the login page
    Given the user is on the login page
@test
  Scenario Outline: Verify login with different user types
    When user is logged in as "<username>","<password>"
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |

  Scenario: Login as a Hr
    When the user logs in as a "Hr"
    Then the user is on the home page

  Scenario: Login as a Helpdesk
    When the user logs in as a "Helpdesk"
    Then the user is on the home page

  Scenario: Login as a Marketing
    When the user logs in as a "Marketing"
    Then the user is on the home page