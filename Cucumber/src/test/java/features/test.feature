Feature: Google Search 

Scenario: Search in google application

Given User is on google home page
When User performs a google "Hello" & "Hi" search
Then Search page is displayed
And Search results for "hellohi" are displayed


Scenario: Search in google application

Given User is on google home page
When User performs a google "Bye" & "bi" search
Then Search page is displayed
And Search results for "byebi" are displayed