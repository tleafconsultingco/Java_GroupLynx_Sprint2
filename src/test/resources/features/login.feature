@login
Feature: User should be able to login

  Background: User is already on the login page
    Given the user is on the login page

  Scenario Outline: Verify login with different user types

    When the user is logged in as "<userName>","<password>"
    Examples:
      | userName                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |

