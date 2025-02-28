Feature: Create Account of leaftaps application
Scenario Outline: Create Account with multiple data 

Given Launch the browser
And Load the url
Given Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123'
When Click on login button
Then it should navigate to next page
When Click on toggle menu button
And Click on View all button
And Click on Accounts from app launcher
And Click on New Button
Given Enter <name> as account name
And Select ownership as public
And Click Save button
Then Verify account name <name>
And Close the browser

Examples:
|name|
|'Keerthi'|
|'Kikie'|
