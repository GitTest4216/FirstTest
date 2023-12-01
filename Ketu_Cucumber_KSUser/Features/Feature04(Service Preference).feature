@ServicePreference
Feature: Service Preference

#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
		
			@PositiveFlow
		Scenario: Verify that the Service Preference tab is displayed or not
		When Verify servicepreference tab is display or not
		
		Scenario: Verify that the Service Preference tab Without Enter any data
		When Verify servicepreference tab without any data
		
		Scenario: Verify that the Service Preference tab only save Only TherapeuticProgram
		When Verify servicepreference tab Save only Enter TherapeuticProgram
		
		Scenario: Verify that the Service Preference tab with Save only TC and Status 
		When Verify servicepreference tab with Save TC and Status 
		
		Scenario: Verify that the Service Preference tab with Save only TC Status Reason
		When Verify servicepreference tab with Save TC Status Reason
		
		Scenario: Verify servicepreference tab with Save TC Status Reason and Specialty new to pharmacy
		When Verify servicepreference tab with Save TC Status Reason and Specialty new to pharmacy
	
	@PositiveFlow
		Scenario: Verify Service Preference with Valid Data
		When verify Service Preference is adding with Valid Data
		
#		And user close the browser