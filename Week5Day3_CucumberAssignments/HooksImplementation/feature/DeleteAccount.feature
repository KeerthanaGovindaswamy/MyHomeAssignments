Feature: Delete account  of leaftaps application
Scenario: Delete account


And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When Click on login button
Then It should navigate to the next page
When Click on the crmsfa link
And Click on the accounts tab
And click on Find Account
Given Enter the account name as 'Keerthu'
When Click on Find Accounts button
And Select account name 'Keerthu'
And click on deactivate account button
Then It should naviagte to next page
Then verify the account name



