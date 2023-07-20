
@EmployeesPage
Feature: Accessing Employees Page

  As a user
  I want to access the Employees page
  So that I can view the available modules and Company Structure by default

  Background: User is already on the login page
    Given the user is on the login page





  Scenario: Verify the user views the modules in the Employees page
    Given I am on the Employees page
    Then I should see the following 8 modules:
      | Company Structure  |
      | Find Employee      |
      | Telephone Directory|
      | Staff Changes      |
      | Efficiency Report  |
      | Honored Employees  |
      | Birthdays          |
      | New page           |

  Scenario: Verify user views the Company Structure by default after clicking the Employees Module
    Given I am on the Employees page
    When I click on the Employees Module
    Then I should be redirected to the Company Structure page
