@Feature1
Feature: To validate the login functionality of facebook application
Background:
Given User has to launch the browser and maximise the window

@tag1
Scenario: To validate login with vaild username and invaild password
When To launch the url of the facebook application
And To pass vaild username in email field
And To pass Invaild password in password field
And To click the login button
And To check whether navigate to the home page or not 
Then To close the browser 

@tag2
Scenario Outline: To validate the positive and negative combination of login functionality
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the  in button
Then User has to close the browser

Examples:
|emaildatas        |passworddatas|
|abc@gmail.com     |abc          |
|xyz@gmail.com     |xyz          |
|selenium@gmail.com|inmakes      |
|api@gmail.com	   |54464644     |
|anandh@gmail.com  |testing      |
|dhinesh@gmail.com |784359       |




