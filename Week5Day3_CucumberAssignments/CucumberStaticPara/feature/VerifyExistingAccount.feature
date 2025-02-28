Feature: Account name verification of leaftaps application
Scenario: Account name verification

Given Launch the browser
And Load the url
Given Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123'
When Click on login button
Then it should navigate to next page
When Click on toggle menu button
And Click on View all button
And Click on Accounts from app launcher
And Search for the account with account name as 'keerthana'
When Click on dropdown icon
And select Edit
And Set type to TechnologyPartner
And Set Industry to Healthcare
Given Enter the Billing Address as 'velachery,chennai'
Given Enter the Shipping Address as 'velachery,chennai'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
Given Enter a unique number in the Phone field as '234567889'
And Set Upsell Opportunity to No
When Click Save button
Then verify the phone number
And Close the browser
