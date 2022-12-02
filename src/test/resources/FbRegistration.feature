@Feature2
Feature: To validate the account creation of fb application

@tag3
Scenario: To create new account
Given To launch the browser and minimise window
When To launch url of fb application
And To click the create new account button
#One dimensional map data with header
And To pass firstname in firstname text box
#key    value
|firstname1|Anandh|
|firstname2|dhinesh|
|firstname3|Banu|
|firstname4|Ashik|

#Without header one dimensional
#|Selenium|Python|Java|PHP|React Native|

And To pass secondname in secondname text box
#Two dimensional with header
And To pass mobileno or email in email text box
|password1|password2|password3|
|jhvkjcvdc|2789213|jgcdslc|
|88394|hjjvcvd66d|dhjcdkcb|
|asdbmad|8798787|jhcvhkavc|
|28739432|khdvcdk|87392|

#withoutheader Twodimensional
#|selenium@gmail.com|756657685|inmakes@gmail.com|28737932|
#|976978976|Anand@gmail.com|Software@gmail.com|785875867878|
#|api@gmail.com|738954534|72582527|7426432748|
And To create new password using new password text box
Then To close the chrome browser



