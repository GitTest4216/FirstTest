@Payor
Feature: PayorInsurance
#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
		

	Scenario: Click on Save button without fill data
		When User click on Save button without fill data
	
	Scenario: verify click on save button after select only insurance type
		When User verify click on save button after select only insurance type
		
	Scenario: Verify Payor Tab some fields should not accept alphabets
		When User verify Payor Tab some fields should not accept alphabets
		
	Scenario: Verify Payor Tab some fields should not accept special characters
		When User verify Payor Tab some fields should not accept special characters
		
	Scenario: Verify Payor Tab some fields should not be blank
		When User verify Payor Tab some fields should not be blank
		
	Scenario: Verify Payor Tab some fields should not accept numeric values
		When User verify Payor Tab some fields should not accept numeric values
		
	Scenario: Verify Payor Tab BIN value should not accept less than six digit
		When User verify Payor Tab BIN value should not accept less than six digit
		
	Scenario: Verify Payor Tab phone number should not accept less than ten digit
		When User verify Payor Tab phone number should not accept less than ten digit
	
	Scenario: Verify Payor Tab insurance effective date and end date should not accept invalid data
		When User verify Payor Tab insurance effective date and end date should not accept invalid data
			
		@PositiveFlow
	Scenario: Add new payor insurance record with valid data
		When User add new payor insurance record with valid data
