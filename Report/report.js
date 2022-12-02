$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sample.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.step({
  "name": "User has to pass the data \"\u003cemaildatas\u003e\" in email field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass the data \"\u003cpassworddatas\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "abc"
      ]
    },
    {
      "cells": [
        "xyz@gmail.com",
        "xyz"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "inmakes"
      ]
    },
    {
      "cells": [
        "api@gmail.com",
        "54464644"
      ]
    },
    {
      "cells": [
        "anandh@gmail.com",
        "testing"
      ]
    },
    {
      "cells": [
        "dhinesh@gmail.com",
        "784359"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"abc@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"abc\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"xyz@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"xyz\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"selenium@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"inmakes\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"api@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"54464644\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"anandh@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"testing\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"dhinesh@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"784359\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the  in button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_click_the_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeofFb.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});