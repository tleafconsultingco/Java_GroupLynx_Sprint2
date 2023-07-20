@Micha
Feature: User should be able to see all the options on the Activity stream page


  Background: User is on the login page
    Given user is on the Activity stream page


  Scenario: user login as helpdesk
    When user is on the activity stream page
    Then user should see the "MESSAGE","TASK","EVENT", "POLL", "MORE" following options


  Scenario: user is on activity stream page
    When user clicks on the more button
    Then user should see the "File", "Appreciation", "Announcement", "Workflow" following options

   #something
















