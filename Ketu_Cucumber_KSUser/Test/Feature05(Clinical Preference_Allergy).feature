@Allergy
Feature: Clinical Preference Allergy

#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
#		
#		Scenario: Add new patient record with valid data
#		When User add new patient record with valid data
#		
	
	
		Scenario: Click on Save button without selection of data
		When Save Allergy tab without selection of data
	
		Scenario: Verify the save without select allergenType
		When User not select allergen Type

		Scenario: Verify the Save without allergy Name Not Selected
		When User not select only Allergy Name

		Scenario: Verify the Save without entering allergy note
		When User not enter only Allergy Note
		
		Scenario: Verify that allergy name field should not accept alpha numeric
		When verify that allergy name field should not accept alpha numeric
		
		Scenario: Verify that allergy name field should not accept special characters
		When verify that allergy name field should not accept special characters
		
		Scenario: Verify that allergy name field should not allow space between name
		When verify that allergy name field should not allow space between name
		
		Scenario: Verify that allergy name field should not be blank
		When verify that allergy name field should not be blank
		
		Scenario: Verify that allergy note field not allow only space
		When verify that allergy note field not allow only space
	
		Scenario: Verify that allergy name field based on type
		When verify that allergy name field based on type
		
		Scenario: Verify allergy tab save with valid data
			When Allergy tab save with valid data
			
		
#		And user close the browser