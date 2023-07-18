Feature: Create a poll by clicking on Poll tab
  Agile story: As a user, I should be able to create a poll by clicking
  on Poll tab under Active Stream.

  Background: Create a poll by clicking on Poll tab
    Given User is on CRM home page
    When User click "Poll"


  Scenario: The delivery should be to 'All employees' by default
    Then user sees 'All employees' by default


  Scenario: User should be able to create a poll by adding questions and multiple answers.
