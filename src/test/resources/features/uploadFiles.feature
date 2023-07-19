@B29G26-272
Feature: Upload files and pictures feature


	@B29G26-269
	Scenario: User should be able to upload file and pictures.
		Given the user is on the message composition page
		    When the user selects a valid file or picture to upload
		    Then the file or picture should be successfully uploaded	

	
	@B29G26-270
	Scenario: User inserts files and images into the text
		Given the user is composing a message
		    When the user inserts a file or image into the text
		    Then the file or image should be displayed in the message text	

	
	@B29G26-271
	Scenario: User removes files and images before sending
		Given the user has inserted a file or image in the message text
		    When the user removes the file or image
		    Then the file or image should no longer be displayed in the message text