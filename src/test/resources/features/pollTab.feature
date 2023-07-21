@B29G26-299
Feature: Default

	#Create a poll by clicking on Poll tab
	#Agile story: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

	@B29G26-292
	Scenario Outline: The delivery should be to 'All employees' by default.
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    Then user sees All employees by default
		    Examples:
		      | userType  |
		      | Hr        |	

	
	@B29G26-293
	Scenario Outline: User should be able to create a poll by adding questions and multiple answers.
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    And user clicks Add question
		    And user write "Question1" into the question field
		    And user write the following answers
		      | Answer 1 |
		      | Answer 2 |
		    Then user creates poll
		    Examples:
		      | userType  |
		      | Hr        |	

	
	@B29G26-294
	Scenario Outline: User should be able to select the “Allow multiple choice” checkbox.
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    Then user select Allow multiple choice
		    Examples:
		      | userType  |
		      | Hr        |	

	
	@B29G26-295
	Scenario Outline:  Mandatory fields: Message title error message
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    And user clicks send button
		    Then user sees "The message title is not specified" error message
		    Examples:
		      | userType  |
		      | Hr        |

	@B29G26-296
	Scenario Outline: Mandatory fields: recipient
		Given user logs in as "<userType>"
		When user clicks "Poll" button
		And user clicks on "All employees" x button
		And user clicks send button
		Then user sees "Please specify at least one person." error message
		Examples:
			| userType  |
			| Hr        |

	
	@B29G26-297
	Scenario Outline: Mandatory fields: 1 question error message
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    And user write "Message" to the message field
		    And user write "Answer" to the answer field
		    And user clicks send button
		    Then user sees "The question text is not specified." error message
		    Examples:
		      | userType  |
		      | Hr        |	

	
	@B29G26-298
	Scenario Outline: Mandatory fields: 1 answer  error message
		    Given user logs in as "<userType>"
		    When user clicks "Poll" button
		    And user write "Message" to the message field
		    And user write "Question" to the question field
		    And user clicks send button
		    Then user see The question "Question" has no answers. error message
		    Examples:
		      | userType  |
		      | Hr        |