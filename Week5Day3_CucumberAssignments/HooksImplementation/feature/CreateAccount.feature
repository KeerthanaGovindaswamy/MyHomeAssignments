Feature: Create account  of leaftaps application
Scenario: create account

And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When Click on login button
Then It should navigate to the next page
When Click crmsfa link
And Click accounts tab
And Click on create account
Given Enter Account name as 'Keerthu'
When click on create account button
Then It should be naviagated to accounts page


