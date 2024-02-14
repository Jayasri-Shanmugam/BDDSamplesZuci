Feature: User Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Success Msg

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Success Msg

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|
#|testuser1|welcome123|
#|testuser2|welcome123

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters credentials
#|tomsmith|SuperSecretPassword!|
#Then Should display Success Msg
#|You logged into a secure area!|

Scenario Outline: Valid Login
Given User is on Login Page
When User enters credentials
|username|password|
|tomsmith|SuperSecretPassword!|
Then Should display Success Msg
|You logged into a secure area!|