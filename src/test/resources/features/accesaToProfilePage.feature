Feature: user able to access my profile page.
@ay
  Scenario:
    Given the user is on the login page
    When user enters HR"hr_username" and "hr_password"
    And user clicks on username on
    Then user click on profile
