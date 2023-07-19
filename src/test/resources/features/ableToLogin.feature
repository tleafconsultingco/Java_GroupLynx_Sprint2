@verifyLogin
Feature: User should be able to login

  Background: User is already on the login page
    Given the user is on the login page

    Scenario: user login as HR
      When user enters HR"username" and "password"
      Then user should land on the home page with HR "title"

  Scenario: user login as Helpdesk
    When user enters Helpdesk"username" and "password"
    Then user should land on the home page with Helpdesk "title"

  Scenario: user login as Marketing
    When user enters Marketing "username" and "password"
    Then user should land on the home page with Marketing "title"