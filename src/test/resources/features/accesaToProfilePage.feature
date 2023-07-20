@ay

Feature: user able to access my profile page.
  Scenario:
   # Given the user is on the login page
    When user logs in as "Hr" user
    And user clicks on username on
    Then user click on profile
    When user should see general button

  Scenario:
    #Given the user is on the login page
    When user logs in as "Helpdesk" user
    And user clicks on username on
    Then user click on profile
    When user should see general button

  Scenario:
   #Given the user is on the login page
    When user logs in as "Marketing" user
    And user clicks on username on
    Then user click on profile
    When user should see general button