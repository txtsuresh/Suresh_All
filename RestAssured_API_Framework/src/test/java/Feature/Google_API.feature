Feature: Google API Automation

@PostMethod @Regression
Scenario Outline: Add address via Google API

Given User has API Endpoint & keyvalue with "<name>" "<address>" "<language>"
When User performs Post action
Then Response is displayed as 200
And "status" is displayed as "OK"
And "scope" is displayed as "APP"


Examples:
|name	|address		|language	|
|suresh	|221 Balliol	|Hindi		|
|Viyaan	|3 Linnsmore 	|Tamil		|
|Yaanvi	|45 Park Town 	|English	|		

@GetMethod @Regression
Scenario: View address via Google API

Given User has API Endpoint & keyvalue & "place_id"
When User performs Get action
Then Response is displayed as 200
And "name" is displayed as "Yaanvi"




