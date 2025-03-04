@all
Feature: User Registration

@smokeTest @regression @register @mandatory-fields
Scenario: Register with mandatory fields
	Given user navigates to registration account page
	When user enters first name "ravikanth" into  the first name field
	And user enters last name "lella" into the last name field
	And user enters email address "ravilella@gmail.com" into email field
	And user enters password "1234" into password field
	And user enters confirm password "1234" into confirm password field
	And user enters telephone number "1234567890" into telephone field
	And user selects privacy policy field
	And user clicks on continue button
	Then Account should get successfully created
	
@smokeTest  @register @all-fields
Scenario: Register with all fields
	Given user navigates to registration account page
	When user enters first name "ravikanth" into  the first name field
	And user enters last name "lella" into the last name field
	And user enters email address "ravilella@gmail.com" into email field
	And user enters password "1234" into password field
	And user enters confirm password "1234" into confirm password field
	And user enters telephone number "1234567890" into telephone field
	And user selects yes for newsletter
	And user selects privacy policy field
	And user clicks on continue button
	Then Account should get successfully created

@regression @register @without-fields
Scenario: Register without providing fields
	Given user navigates to registration account page
	When user donot enter details into any fields
	And user clicks on continue button
	Then warning message should be displayed for all the mandatody fields