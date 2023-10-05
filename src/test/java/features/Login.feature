Feature: login feature

Background:
Given launch the browser
And trigger the url 

Scenario: login to the application
When enter the userName and password 
And click on login button
Then home pahe should be displayed
   

