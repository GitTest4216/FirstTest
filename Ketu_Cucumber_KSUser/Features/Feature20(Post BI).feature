@PostBI 
Feature: PostBI 

#		Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
	
	@PositiveFlow
		Scenario: Verify that the Post BI permission
		When Verify the Post BI permission
	
		Scenario: Save Post BI without data
		When User save the PostBi activity without adding data

	@PositiveFlow
		Scenario: Save Post BI with valid data
		When User save the postbi activity with valid data
		
		

#		And user close the browser		