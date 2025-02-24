Feature: Login functionality of Leaftaps application

@Regression
Scenario: Login with valid credentials
And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When click on the login button
Then It should navigate to the next page

@Sanity @Regression
Scenario: Login with invalid credentials
And Enter the username as 'Demo'
And Enter the password as crmsfa
When click on the login button
Then It should throw error message