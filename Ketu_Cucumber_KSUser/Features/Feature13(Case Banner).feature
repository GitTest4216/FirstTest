@Case_Banner
Feature: Case Banner
#
#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
	
		Scenario: Verify the permisson of case banner
		When Check Permission for Case Banner
		
		Scenario: Verify the save case banner without enter any data
		When User save case banner without entering any data	
		
		Scenario: Verify the save case banner with invalid data
		When 	User save case banner with invalid data	
		
		@PositiveFlow
		Scenario: Verify the save case banner with valid data
		When 	User save case banner with valid data
	
#		And user close the browser		