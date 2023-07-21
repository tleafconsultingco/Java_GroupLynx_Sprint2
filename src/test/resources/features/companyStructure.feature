@B29G26-261 @companyStructure
Feature: Functions on the Company Structure page under Employee menu
  User Story B29G26-261:
  As a user, I should be able to use functions on Company Structure under Employee menu.

  Acceptance Criteria:
  1. All user types should be able to display company structure.
  2. Hr user should be able to add a department from the company structure.
  3. There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.

  @B29G26-285 @passed
  Scenario Outline: US261-TC01. Verify ALL user types display company structure header on the company structure page (AC01)
    When user logs in as "<userType>"
    And user clicks on "Employees" menu
    Then user sees "Company Structure" displayed
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @B29G26-286 @passed
  Scenario: US261-TC02. Verify HR user can add a department on the company structure page (AC02)
    When user logs in as "Hr"
    And user clicks on "Employees" menu
    Then hr user should be able to add department

  @B29G26-287 @passed
  Scenario: US261-TC03. Verify HELPDESK user does not have "add department" option on the company structure page (AC03)
    When user logs in as "Helpdesk"
    And user clicks on "Employees" menu
    Then user should not see Add Department option

  @B29G26-288 @passed
  Scenario: US261-TC04. Verify MARKETING user does not have "add department" option on the company structure page (AC03)
    When user logs in as "Marketing"
    And user clicks on "Employees" menu
    Then user should not see Add Department option
