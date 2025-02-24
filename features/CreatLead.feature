Feature: CreateLead functionality of leaftaps application

Scenario Outline: CreateLead with multipledata

And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When click on the login button
Then It should navigate to the next page
When click on CRMSFA link
And click on Leads link
And click on CreateLead link
Given Enter the companyname as <Companyname>
And Enter the firstname as <Firstname>
And Enter the lastname as <Lastname>
When click on Create Lead button
Then Lead should be created

Examples:
|Companyname|Firstname|Lastname|
|'TL'|'Kikie'|'Ravi'|
|'Wipro'|'Keerthi'|'Swamy'|