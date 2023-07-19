@verifyLogin
Feature: User should be able to login

  Background: User is already on the login page
    Given the user is on the login page

  Scenario: user login as HR
    When user enters HR"hr_username" and "hr_password"
    And entries should be masked in password field1
    Then user should land on the home page with HR "title"

  Scenario: user login as Helpdesk
    When user enters Helpdesk"helpdesk_username" and "helpdesk_password"
    And entries should be masked in password field2
    Then user should land on the home page with Helpdesk "title"

  Scenario: user login as Marketing
    When user enters Marketing "marketing_users" and "marketing_password"
    And entries should be masked in password field3
    Then user should land on the home page with Marketing "title"
