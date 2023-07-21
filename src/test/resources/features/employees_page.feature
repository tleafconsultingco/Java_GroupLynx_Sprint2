
@EmployeesPage
Feature: Accessing Employees Page

  As a user
  I want to access the Employees page
  So that I can view the available modules and Company Structure by default


@modules
  Scenario Outline: Verify the modules on Employees page
    When user logs in as "<userType>"
    And user clicks on the Employees module
    Then the following modules should be visible on the Employees page:
      | Company Structure |
      | Find Employee     |
      | Telephone Directory |
      | Staff Changes     |
      | Efficiency Report |
      | Honored Employees |
      | Birthdays         |
      | New page        |


    Examples:
      | userType  |
      | hr       |
      | helpdesk |
      | marketing |


  Scenario Outline:Verify Company Structure is displayed by default
    Given user logs in as "<userType>"
    When user clicks on the Employees module
    Then user should see the Company Structure module as the default view
    Examples:
      | userType  |
      | hr       |
      | helpdesk |
      | marketing |


















