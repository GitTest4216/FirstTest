@POS @PositiveFlow
Feature: POS 

#		Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
		
			Scenario: Save POS with valid data
			When User save the point of sale activity with valid data
		
			Scenario: Complete Intake WorkFlow
			When User Complete Intake WorkFlow
			
			Scenario: Complete BI WorkFlow
			When User Complete BI WorkFlow
			
			Scenario: Complete COC WorkFlow
			When User Complete COC WorkFlow
			
			Scenario: Complete CoD WorkFlow
			When User Complete CoD WorkFlow
			
			Scenario: Complete POS WorkFlow
			When User Complete POS WorkFlow
		
			Scenario: Complete PE WorkFlow
			When User Complete PE WorkFlow
		
			Scenario: Create Refill Case
			When User create refill case
		
#		And user close the browser		