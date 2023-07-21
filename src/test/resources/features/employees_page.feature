
@EmployeesPage
Feature: Accessing Employees Page

  As a user
  I want to access the Employees page
  So that I can view the available modules and Company Structure by default

  Scenario Outline: Verify user views the Company Structure by default after clicking the Employees Module
    When user logs in as "<userType>"
    And user clicks on Employees menu
    Then I should be redirected to the Company Structure page

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      #| marketing |



  Scenario: Verify the user views the modules in the Employees page
    Given I am on the Employees page
    Then I should see the following  modules:
      | Company Structure  |
      | Find Employee      |
      | Telephone Directory|
      | Staff Changes      |
      | Efficiency Report  |
      | Honored Employees  |
      | Birthdays          |
      | New page           |







