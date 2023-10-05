Feature: login feature

Background:
Given launch the browser
And trigger the url 

Scenario: login to the application
And enter the userName as "admin" and password as "manager"
And click on login button
Then home pahe should be displayed