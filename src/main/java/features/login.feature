#user demo
Feature: Login google

Scenario: user login gmail
#Scenario Outline: user login gmail

Given user is on gmail page
When user sign in
Then user enters username and password
|user1|pwd|

Then clicks on login button
Then user is navigated to gmail

#Examples:

#|username|password|

#|user1|pwd1|
#|user2|pwd2|

