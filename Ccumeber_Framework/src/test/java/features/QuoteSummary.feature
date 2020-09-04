Feature: Sunlife Quote Summary

Scenario Outline: Access Coverage page

Given User launch sunlife URl "https://www.sunlife.ca/en/get-a-quote/"
When User selects Get a Quote button
And User enter <DOB> values on Get a Quote page
Then Coverage page is displayed

Examples:
|DOB|
|11/01/1989|
#|10/10/1990|



Scenario: Access Coverage page

Given User launch sunlife URl "https://www.sunlife.ca/en/get-a-quote/"
When User selects Get a Quote button
And User enter values on Get a Quote page
And User enter values on Coverage page
#Then Health Info page is displayed

