@Consent
Feature: Consent
#	Scenario: Verify login with correct username and correct password
#	 Given User Launch Chrome Browser
#	 When User enters correct username and correct password
		
		@PositiveFlow
		Scenario: Click on Patient Consent Tab 
	 	When User click on Patient Consent Tab
	 	
	 @PositiveFlow
		Scenario: Verify the Add Patient Consent Elements
		When User click on Add Patient Consent Elements
	 
		Scenario:	Verify that Relationship Value should not accept numeric,alphabets,special characters values
		When User enter numeric,alphabets,special characters Value in Relationship Value
	 
		Scenario:	Verify that Userrole Value should not accept numeric,alphabets,special characters values
	 	When User enter numeric,alphabets,special characters Value in Userrole Value
	 
		Scenario:	Verify that Username Value should not accept numeric,alphabets,special characters values
	 	When User enter numeric,alphabets,special characters Value in Username Value
	 
  	Scenario:	Verify that Methods Value should not accept numeric,alphabets,special characters values
	 	When User enter numeric,alphabets,special characters Value in Methods Value
 
 @PositiveFlow
  	Scenario:	Verify that select correct value in methods dropdown
	 	When User select correct value in methods dropdown
	 
		Scenario:	Verify that Consent Type Value should not accept numeric,alphabets,special characters values
	 	When User enter numeric,alphabets,special characters Value in Consent Type Value
	 
	 @PositiveFlow
		Scenario:	Verify that select correct value in Consent Type
	 	When User select correct value in Consent Type
	 	
	@PositiveFlow
		Scenario:	Verify that Add the Consent Type
	 	When User Add the Consent Type
	 
	 @PositiveFlow
		Scenario:	Verify that save all consent activity
	 	When User save all consent activity
	 	
	 	#And user close the browser