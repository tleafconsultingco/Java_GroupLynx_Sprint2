Feature: user add link message

@serhat
  Scenario Outline: verify user can attach link specified text
    Given user logs in as "<userType>"
    And user clicks the message button
    And user clicks the link button
    And user types "google" in text box
    And user types "www.google.com" in link box
    And user clicks save button
    And user clicks send button
    And user sees message with link
    And user clicks the link in new message
    Then user verify "Google" URL

  Examples:
    | userType  |
    | Hr       |
    | Helpdesk |
    | Marketing |






