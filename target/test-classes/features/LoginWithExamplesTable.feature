Feature: login feature

Background:
Given launch the browser
And trigger the url 

Scenario Outline: login to the application with examples table
And enter the userName as "<username>" and password as "<password>"
And click on login button
Then home pahe should be displayed
Examples:
|username|password|
|admin|manager|
|trainee|trainee|