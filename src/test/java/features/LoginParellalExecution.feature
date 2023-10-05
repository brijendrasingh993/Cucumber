Feature: login feature

Background:
Given launch the browser
And trigger the url 

@smoke 
Scenario: login to the application as admin
And enter the userName as "admin" and password as "manager"
And click on login button
Then home pahe should be displayed

@regression
Scenario: login to the application as trainee
And enter the userName as "trainee" and password as "trainee"
And click on login button
Then home pahe should be displayed