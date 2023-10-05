Feature: login feature

Background:
Given launch the browser
And trigger the url 

Scenario Outline: login to the application with table as list/map
And enter the username and password
|username|password|
|admin|manager|
And click on login button
Then home pahe should be displayed