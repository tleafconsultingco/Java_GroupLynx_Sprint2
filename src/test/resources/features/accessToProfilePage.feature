@ay
Feature: user able to access my profile page.

  Scenario Outline:
    When user logs in as "<Account>" user
    And user clicks on username on
    And user click on profile
    Then user should see options button General,Drive,Tasks,Calendar,Conversations
    Then user sees the email address under the General tab
    Examples:
      | Account   |
      | Hr        |
      | Helpdesk  |
      | Marketing |


