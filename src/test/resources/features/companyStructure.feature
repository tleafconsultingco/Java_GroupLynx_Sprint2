@companyStructure
Feature: Functions on the Company Structure under Employee Menu
  User Story:
  As a user, I should be able to use functions on Company Structure under Employee menu.

  Acceptance Criteria:
  1. All user types should be able to display company structure.
  2. Hr user should be able to add a department from the company structure.
  3. There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.

  Background: User is already on the login page
    Given the user is on the login page

  @passed
  Scenario Outline: All user types display company structure
    When user logs in with "<username>","<password>"
    And user clicks on Employees menu
    Then user should see "Company Structure" displayed
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |

  @passed
  Scenario: HR user should be able to add a department from the company structure
    When the user logs in as a "hr"
    And "hr" is on the landing page
    And user clicks on Employees menu
    Then hr user should be able to add department

  @haveQuestions
  Scenario: Helpdesk user does not have "add department" option from the company structure
    When the user logs in as a "Helpdesk"
    And user clicks on Employees menu
    Then user should not see Add Department option

  @haveQuestions
  Scenario: Marketing user does not have "add department" option from the company structure
    When the user logs in as a "Marketing"
    And user clicks on Employees menu
    Then user should not see Add Department option
