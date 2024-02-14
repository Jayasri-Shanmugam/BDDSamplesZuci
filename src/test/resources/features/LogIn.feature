Feature: Sign in

Scenario: valid sign in

Given User is in login Page

When User enter valid credentials

Then should display success message
 
Scenario: Invalid sign in

Given User is in login Page

When User enter invalid credentials

Then should display invalid sign in message