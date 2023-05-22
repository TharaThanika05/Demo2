Feature: Login Feature
Background: 
Given: I am from Nyka page Scenarios


Scenario: Search in Nykaa with Valid Data
Given I Launch the Application
When I clicked a search area
And I Entered a productname
And I seleceted data from the suggesstion
Then I verified the search result

Scenario: Search in Nykaa without clicking Searching field
Given I Launch the Application
When I Entered a productname
And I seleceted data from the suggesstion
Then I verified the search result
