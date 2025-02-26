Feature: Account name verification of leaftaps application
Scenario: Account name verification

Given Launch the browser
And Load the url
Given Enter the username as vidyar@testleaf.com
And Enter the password as Sales@123
When Click on login button
Then it should navigate to next page
When Click on toggle menu button
And Click on View all button
And Click on Sales from app launcher
And Click on accounts tab
And click on New button
Given Enter your name as 'Keerthana'
And select ownership as public
When Click on Save button
Then Verify the account name 'Keerthana'
And Close the browser



