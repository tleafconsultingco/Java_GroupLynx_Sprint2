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
  Scenario Outline: User able to send an appreciation by filling in mandatory fields
    When user logs in with "<username>","<password>"
    And user clicks on More tab
    And user clicks on Appreciation option
    And user provides message title
    And user add a recipient using Add employees button
    And user clicks SEND button
    Then user should see new message on Activity Stream
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |

    @stillWorking
  Scenario Outline: User able to send an appreciation by filling in mandatory fields
    When user logs in with "<username>","<password>"
    And user clicks on More tab
    And user clicks on Appreciation option
    And user provides message title

    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | marketing94@cybertekschool.com | UserUser |





