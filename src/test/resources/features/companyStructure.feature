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

  Scenario Outline: All user types display company structure
    When the user is logged in as "<userName>","<password>"
    And "<userType>" is on the landing page
    And user clicks on Employees menu
    Then user should see "Company Structure" displayed
    Examples:
      | userType  | userName                        | password |
      | hr        | hr1@cybertekschool.com          | UserUser |
      | helpdesk  | helpdesk1@cybertekschool.com    | UserUser |
      | marketing | marketing100@cybertekschool.com | UserUser |
    # Marketing user has invalid credentials

  Scenario: HR user should be able to add a department from the company structure
    When the hr user is logged in as "hr1@cybertekschool.com", "UserUser"
    And "hr" is on the landing page
    And user clicks on Employees menu
    Then hr user should be able to add department

    Scenario Outline: Helpdesk and marketing user do not have "add department" option from the company structure
      When the user is logged in as "<userName>","<password>"
      And "<userType>" is on the landing page
      And user clicks on Employees menu
      Then user should not see Add Department option
      Examples:
        | userType  | userName                        | password |
        | helpdesk  | helpdesk1@cybertekschool.com    | UserUser |
        | marketing | marketing100@cybertekschool.com | UserUser |

