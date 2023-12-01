@Communication_Log
Feature: Communication Log
#	Scenario: Verify login with incorrect username and correct password
#		Given User Launch Chrome Browser
#		When User enters incorrect username and correct password
		
		Scenario: Verify Communication Log Without any data
		When User try to save Communication Log without any data
		
		Scenario: Verify Communication Log With Invalid data
		When User try to save Communication Log with Invalid data

		Scenario: Verify Communication Log Not Accepting Numeric
		When User try to save Communication Log not accepting Numeric
		
		Scenario: Verify Communication Log With Special Characters
		When User try to save Communication Log with special characters
		
		@PositiveFlow
		Scenario: Verify Communication Log With Valid Data
		When User try to save Communication Log with Valid date
			
	#	And User close the browser
		