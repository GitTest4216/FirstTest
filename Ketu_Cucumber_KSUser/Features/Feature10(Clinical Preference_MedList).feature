@MedList
Feature: Clinical Preference MedList

#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
#		
#		Scenario: Add new patient record with valid data
#		When User add new patient record with valid data

   
	Scenario: Save Med List tab without selection of data
		When Save Med List tab without selection of data
		
		Scenario: User enter alphabets in dropdown Med List tab
		When User enter alphabets in dropdown Med List tab
		
		Scenario: User enter numeric value in dropdown Med List tab
		When User enter numeric value in dropdown Med List tab
		
		Scenario: verify that Med List tab should not accept special characters
		When verify that Med List tab should not accept special characters
		
		
		Scenario: verify that Med List tab should not be saved with blank space
		When verify that Med List tab should not be saved with blank space
		
		Scenario: User not select Date Med List tab
		When User not select Date Med List tab
		
		Scenario: verify that Medication Name field should not accept numeric values
		When verify that Medication Name field should not accept numeric values
		
			Scenario: verify that all fields not allow only space in Med List tab
		When verify that all fields not allow only space in Med List tab
		
			Scenario: verify that some fields not accept alphabets in Med List tab
		When verify that some fields not accept alphabets in Med List tab
		
		
			Scenario: verify that some fields not accept special characters
		When verify that some fields not accept special characters
		
		Scenario: Med List with Valid Data
		When Med List with Valid Data