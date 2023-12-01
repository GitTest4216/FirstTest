@HealthHistory

Feature: Clinical Preference Health History

#	Scenario: Verify login with correct username and correct password
#		Given User Launch Chrome Browser
#		When User enters correct username and correct password
#		
#		Scenario: Add new patient record with valid data
#		When User add new patient record with valid data
	
	
	#--------------------Family_History-----------------
	Scenario: Save Family History tab without selection of data
		When Save Family History tab without selection of data
		
		Scenario: verify all fields should not accept alphabets Family History
		When verify all fields should not accept alphabets Family History
		
		Scenario: verify that Family History tab should not accept special characters
		When verify that Family History tab should not accept special characters
		
		Scenario: verify all fields should not accept numeric values Family History
		When verify all fields should not accept numeric values Family History
		
		Scenario: verify that Family History tab should not be saved with blank space
		When verify that Family History tab should not be saved with blank space
		
		Scenario: Family History with Valid Data
		When Family History with Valid Data
		
		#-----------------Medical_History---------------------------------------
		Scenario: Save Medical History tab without selection of data
		When Save Medical History tab without selection of data
		
		Scenario: verify all fields should not accept alphabets Medical History
		When verify all fields should not accept alphabets Medical History
		
		
		Scenario: verify that Medical History tab should not accept special characters
		When verify that Medical History tab should not accept special characters
		
		Scenario: verify all fields should not accept numeric values Medical History
		When verify all fields should not accept numeric values Medical History
		
		Scenario: verify that Medical History tab should not be saved with blank space
		When verify that Medical History tab should not be saved with blank space
		
		Scenario: Medical History with Valid Data
		When Medical History with Valid Data
		
		#------------------Review_Of_Systems--------------------------------
		Scenario: Save Review Of Systems tab without selection of data
		When Save Review Of Systems tab without selection of data
		
		Scenario: verify all fields should not accept alphabets Review Of Systems tab
		When verify all fields should not accept alphabets Review Of Systems tab
		
		Scenario: verify all fields should not accept numeric values Review Of Systems
		When verify all fields should not accept numeric values Review Of Systems
		
		Scenario: verify that Review Of Systems tab should not accept special characters
		When verify that Review Of Systems tab should not accept special characters
		
		Scenario: verify that Review Of Systems tab should not be saved with blank space
		When verify that Review Of Systems tab should not be saved with blank space
		
		Scenario: Review Of Systems with Valid Data
		When Review Of Systems with Valid Data
		
		#----------------------Surgical_tab-------------------------------
		Scenario: Save Surgical tab without selection of data
		When Save Surgical tab without selection of data
		
		Scenario: verify all fields should not accept alphabets Surgical tab
		When verify all fields should not accept alphabets Surgical tab
	
		Scenario: verify all fields should not accept numeric values Surgical
		When verify all fields should not accept numeric values Surgical
		
		Scenario: verify that Surgical tab should not accept special characters
		When verify that Surgical tab should not accept special characters
		
		Scenario: verify that Surgical tab should not be saved with blank space
		When verify that Surgical tab should not be saved with blank space
		
		Scenario: Surgical tab with Valid Data
		When Surgical tab with Valid Data
		
	