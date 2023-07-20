Feature: user add link message

  Background: User is already on the login page
    Given the user is on the login page


@serhat
  Scenario Outline: verify user can attach link specified text
    When user is logged in as "<username>","<password>"
    And user clicks the message button
    And user clicks the link button
    And user types "google" in text box
    And user types "www.google.com" in link box
    And user clicks save button
    And user clicks send button
   Then user should see message with link
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |




  # user clicks the link in new message -> ask leena
   # user verify URL -> leena

  Scenario Outline: verify user can navigate to correct URL after clicking link
    When user is logged in as "<username>","<password>"
    And user clicks the message button
    And user clicks the link button
    And user types "google" in text box
    And user types "www.google.com" in link box
    And user clicks save button
    And user clicks send button
    And user should see message with link
    And user clicks the link in new message
    Then user verify URL

    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |




