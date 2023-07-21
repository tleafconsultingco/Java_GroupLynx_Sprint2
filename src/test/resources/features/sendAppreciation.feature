@sendAppreciation
Feature: Send an appreciation
  US: As a user, I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

  AC:
  1. User should be able to send an appreciation by filling in the mandatory fields.
  2. The delivery should be to 'All employees' by default.
  3. User should be able to cancel sending appreciation at any time before sending.

  Description details:
  Mandatory fields: 'Message Content' & 'Recipient'.
  Error messages for mandatory fields:
  "The message title is not specified."
  "Please specify at least one person."

  @passed
  Scenario Outline: Verify user can send an appreciation by filling in mandatory fields (AC01)
    When user logs in as "<userType>"
    And user clicks "More" tab
    And user clicks on "Appreciation" option
    And user provides "<messageTitle>" in message title
    And user adds a recipient using Add employees button
    And user clicks send button
    Then user sees "<messageTitle>" message on Activity Stream
    Examples:
      | userType  | messageTitle      |
      | hr        | you are beautiful |
      | helpdesk  | you are beautiful |
      | marketing | you are beautiful |

  @fail
  Scenario Outline: Verify the delivery is 'All employees' by default (AC02)
    When user logs in as "<userType>"
    And user clicks "More" tab
    And user clicks on "Appreciation" option
    Then user verifies "All employees" is in delivery
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @passed
  Scenario Outline: Verify can cancel sending appreciation at any time before sending
    When user logs in as "<userType>"
    And user clicks "More" tab
    And user clicks on "Appreciation" option
    And user clicks the cancel button
    Then user sees appreciation box collapse
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |





