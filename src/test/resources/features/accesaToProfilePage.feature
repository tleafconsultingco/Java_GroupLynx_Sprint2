@ay

Feature: user able to access my profile page.
  Scenario:
    Given the user is on the login page
  When the user logs in as a "Hr"
    And user clicks on username on
    Then user click on profile
    When user should see general button

  Scenario:
    Given the user is on the login page
    When the user logs in as a "Helpdesk"
    And user clicks on username on
    Then user click on profile
    When user should see general button

  Scenario:
    Given the user is on the login page
    When the user logs in as a "Marketing"
    And user clicks on username on
    Then user click on profile
    When user should see general button