Feature: Login Action
Scenario Outline: Succussfull login with valid credentials
Given User opens the application
When User clicks on signin link
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username|password   |
|lalitha |password123|
|admin   |password456|