Feature: login feature

Scenario: login succesfully with valid credentials

	Given user is on login page
	Then user enter "standard_user" and "secret_sauce"
	Then user click on login button
	When product page open
	
Scenario: try to login with invalid credentials

	Given user is on login page
	Then user enter "username" incorrect "password" details
	Then user click on login button
	When error is message popup
	

	