login app

Scenario: Login to the app
Given user is on the landingPage
When he enters for "<phone>" and "<password>"
Then error message should be displayed "<errormsg>"
Examples:
| phone || password ||errormsg|
| 9898789999 || password1 || Incorrect login details|
| 4545454566 || password2 || Incorrect login details|
