@Feature4
Feature: As a User, I want to Order the food

Background:
Then To close the website
@bisto1
Scenario: The user gives the invalid “User name” and “password”
Given The user enters the testing site.
When click the “Account” button.
And Give the wrong “Username” and “Password”.
And click the “login” button.
And check the output (Invalid Mobile No).

@bisto2
Scenario: The User successfully add the Dosa
Given that I am logged in as a user and on the home page.
When I see the “HOME” button on the page and click it.
And I see a dropdown labeled “Dosa”.
And Click the dosa button.
And select the “Masala Dosa” option.
And Enter the page and check the “Available Time”.
@bisto3
Scenario: The user fills out the registration form and ignores the confirm password.
Given that I am logged in as a user and on the home page
When Miximise the window
And  click the Account button.
And Fill out the registration form with dummy data. (name, phone number, email…).
And Skip the “confirm password” text label.
And click the register button.
And Get the pop-up “Please fill out the field”.

@bisto4
Scenario: The user search for the “Coke” can and check the price
Given That I am logged in as a user and on the home page.
When Click the “search” icon.
And search “Coffee” and check the can dollar is “$ 1.50”.

@bisto5
Scenario: The user selects the “Spanish Omelet”.
Given That I am logged in as a user and on the homepage
When To click the “search” icon.
And Find out the “Spanish Omelet” and Click the icon.
And Select the option by probability.
And check the dollar probability.

@bisto6
Scenario: The user read “Our Story”
Given that I am logged in as a user and on the Home page.
When Click the “Our Story” option.
And Check the spelling mistake.