@wip
Feature: Create a poll by clicking on Poll tab
  Agile story: As a user, I should be able to create a poll by clicking
  on Poll tab under Active Stream.

  Background: Create a poll by clicking on Poll tab
    Given User is on CRM home page
    Given User is logged in with "username" and "password"
    When User click Poll



  Scenario: The delivery should be to 'All employees' by default
    Then user sees All employees by default


  Scenario: User should be able to create a poll by adding questions and multiple answers.
    When user clicks Add question
    Then user write questions
    And user write multiples answers


  Scenario: User should be able to select 'Allow multiple choice' checkbox.
    Then user select Allow multiple choice


  Scenario: User write mandatory fields: Message title, recipient, 1 question, 1 answer
    When user does not write message title
    And click send button
    Then user sees error message: The message title is not specified
    When user does not specified recipient
    And click send button
    Then user sees error message: Please specify at least one person.
    When user does not write a question
    And click send button
    Then user sees error message: The question text is not specified.
    When the user does not write the answer
    And click send button
    Then user sees error message: The question "........." has no answers.

