Feature: Login 

Scenario Outline: Login to TestMe App

Given User is on Login page
When User enters the username as "<uname>"
And User enters the pasword as "<pass>"
When User clicks on login
When Verify successfull login
Then Close the application

Examples:
|uname||pass|
|whitewalkers||khaleesi|
