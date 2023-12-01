@Vitals
Feature: Clinical Preference Vitals

#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
#		
#		Scenario: Add new patient record with valid data
#		When User add new patient record with valid data


	Scenario: Save Vitals tab without selection of data
		When Save Vitals tab without selection of data
		
		Scenario: User not select vital Date
		When User not select vital Date
		
		Scenario: User not select only Vital Height
		When User not select only Vital Height
		
		Scenario: User not select only Vital Weight
		When User not select only Vital Weight
		
		Scenario: User not select only Temperature
		When User not select only Temperature
		
		Scenario: User not select only BP Field
		When User not select only BP Field
		
		Scenario: User enter Invalid Height Value
		When User enter Invalid Height Value
		
		Scenario: User enter Invalid Temperature Value
		When User enter Invalid Temperature Value
		
		Scenario: User enter Invalid BP Value
		When User enter Invalid BP Value
		
		Scenario: User enter Invalid Height Float Value
		When User enter Invalid Height Float Value
		
		Scenario: verify that Height field should not be blank
		When verify that Height field should not be blank
		
		Scenario: verify that Weight field should not accept special characters
		When verify that Weight field should not accept special characters
		
		Scenario: verify that Weight field not allow only space
		When verify that Weight field not allow only space
		
		Scenario: verify that Temperature field should not accept special characters
		When verify that Temperature field should not accept special characters
	
		Scenario: verify that Temperature field should not be blank
		When verify that Temperature field should not be blank
		
		Scenario: User enter Invalid BP Floating Value
		When User enter Invalid BP Floating Value
		
		Scenario: verify that BP field should not accept special characters
		When verify that BP field should not accept special characters
		
			Scenario: verify that BP field should not be blank
		When verify that BP field should not be blank
		
			Scenario: Vital Tab With Valid Data
		When Vital Tab With Valid Data
		
		
		
		