Feature: User Login

Scenario: successful login with valid credientials
	Given user navigates to login page
	When user enters valid email "ravilella@gmail.com"
	And user enters valid password "password"
	And user clicks on login button
	Then The user should be redirected to the dashboard
	
Scenario: login attempt with invalid credientials
	Given user navigates to login page
	When user enters invalid email "ravilella@gmail.com"
	And user enters invalid password "password"
	And user clicks on login button
	Then An error message invalid user or password should be displayed
	
Scenario: login with invalid email and valid password
	Given user navigates to login page
	When user enters invalid email "ravilella@gmail.com"
	And user enters valid password "password"
	And user clicks on login button
	Then user should get proper warning message
	
Scenario: login with valid email and invalid password
	Given user navigates to login page
	When user enters valid email "ravilella@gmail.com"
	And user enters invalid password "password"
	And user clicks on login button
	Then user should get proper warning message
	
	