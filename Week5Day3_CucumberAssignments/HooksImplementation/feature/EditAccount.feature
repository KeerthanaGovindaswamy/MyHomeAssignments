Feature: Edit account  of leaftaps application
Scenario Outline: Edit account

And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When Click on login button
Then It should navigate to the next page
When Click on crmsfa link
And Click on accounts tab
And click on Find Account button
Given enter account name as <AccountName>
When Click on the Find Accounts button
And Select the account name as <AccountName>
When Click on edit button
And select industry
And enter the description
When click on save button
Then It should navigate to account details page


Examples:
|AccountName|
|'keerthana'|
