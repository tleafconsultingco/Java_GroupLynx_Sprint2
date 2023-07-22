Feature: Logout functionality

  Scenario Outline: Verify the users can log out from the app after clicking the “Log out” button.
    Given user logs in as "<userType>"
    Then user is on the home page
    Then user clicks on profile page
    Then user clicks on logout button
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify users see 5 options under the profile name
    Given user logs in as "<userType>"
    Then user is on the home page
    Then user clicks on profile page
    Then user sees five options under the profile name

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |










