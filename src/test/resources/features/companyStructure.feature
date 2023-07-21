@companyStructure
Feature: Functions on the Company Structure under Employee Menu
  User Story:
  As a user, I should be able to use functions on Company Structure under Employee menu.

  Acceptance Criteria:
  1. All user types should be able to display company structure.
  2. Hr user should be able to add a department from the company structure.
  3. There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.

  @passed
  Scenario Outline: All user types display company structure
    When user logs in as "<userType>"
    And user clicks on "Employees" menu
    Then user sees "Company Structure" displayed
    Examples:
      | userType  |
      | hr        |
      #| helpdesk  |
      #| marketing |

  @passed
  Scenario: HR user should be able to add a department from the company structure
    When user logs in as "Hr" user
    And user clicks on "Employees" menu
    Then hr user should be able to add department

  @haveQuestions
  Scenario: Helpdesk user does not have "add department" option from the company structure
    When user logs in as "Helpdesk" user
    And user clicks on "Employees" menu
    Then user should not see Add Department option

  @haveQuestions
  Scenario: Marketing user does not have "add department" option from the company structure
    When user logs in as "Marketing" user
    And user clicks on "Employees" menu
    Then user should not see Add Department option
