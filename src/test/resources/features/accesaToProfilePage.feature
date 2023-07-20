@ay
Feature: user able to access my profile page.

  Background:
    And user clicks on username on
    And user click on profile
    Then user should see options button General,Drive,Tasks,Calendar,Conversations


  Scenario:
   # Given the user is on the login page
    When user logs in as "Hr" user
    #And user clicks on username on
    #And user click on profile
    #Then user should see options button General,Drive,Tasks,Calendar,Conversations


  Scenario:
    #Given the user is on the login page
    When user logs in as "Helpdesk" user
    #And user clicks on username on
    #Then user click on profile
    #Then user should see options button General,Drive,Tasks,Calendar,Conversations

  Scenario:
   #Given the user is on the login page
    When user logs in as "Marketing" user
    #And user clicks on username on
    #Then user click on profile
    #Then user should see options button General,Drive,Tasks,Calendar,Conversations