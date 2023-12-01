@Add_Case
Feature: Add Case
	
#	Scenario: Verify login with correct username and correct password
#	 Given User Launch Chrome Browser
#	 When User enters correct username and correct password
	
	Scenario: Click on Create case button 
	 When User click on create case button
		
	Scenario:  Verify Click on Create case button with Select PharmacyStore
	 When User Select PharmacyStore
	
	Scenario:	Verify that Therapeutic Program should not accept numeric,alphabets,special characters values
	 When User enter numeric,alphabets,special characters Value in Therapeutic Program
	
	Scenario:  Verify Click on Create case button with Select Therapeutic Program
	 When User Select Therapeutic Program
		
	Scenario:  Verify Click on Create case button with Select Service
	 When User Select Service
	
	Scenario:	Verify that Care Plan should not accept numeric,alphabets,special characters values
	 When User enter numeric,alphabets,special characters Value in Care Plan
	
	Scenario:  Verify Click on Create case button with Select CarePlan
	 When User Select CarePlan
	
@PositiveFlow
	Scenario: Click on Create case with All valid Data
	 When User click on create case with All valid Data
