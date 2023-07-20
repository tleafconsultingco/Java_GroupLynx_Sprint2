@login @passed
Feature: User types logged in with valid credentials

  @passed
  Scenario Outline: Verify login with different user types
    Given user logs in as "<userType>"
    Then user is on the home page
    Examples:
      | userType  |
      | hr       |
      | helpdesk |
      | marketing |

  @passed
  Scenario: Login as a Hr
    Given user logs in as "Hr" user
    Then user is on the home page

  @passed
  Scenario: Login as a Helpdesk
    Given user logs in as "Helpdesk" user
    Then user is on the home page

  @passed
  Scenario: Login as a Marketing
    Given user logs in as "Marketing" user
    Then user is on the home page