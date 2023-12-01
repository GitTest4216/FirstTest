@Patient 
Feature: Patient
#Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
		
	Scenario: Click on Save button without selection of data
		When User click on Save button without selection of data
	
	Scenario: Verify that some fields should not accept alphabets
		When User verify that some fields should not accept alphabets
		
	Scenario: Verify that some fields should not accept numeric values
		When User verify that some fields should not accept numeric values
		
	Scenario: Verify that some fields should not accept special characters
		When User verify that some fields should not accept special characters
		
	Scenario: Verify that some fields should not be blank
		When User verify that some fields should not be blank		
		
@PositiveFlow
	Scenario: Add new patient record with valid data
		When User add new patient record with valid data