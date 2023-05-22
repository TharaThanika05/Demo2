Feature: Searching brand nmaes

Background:
Given Hello From Brandsearch

@Brands 
Scenario: Search Valid Brand Name
Given I Launched the application
When I Hovered Over the Brands tab
And I Searched for a valid Brandname
Then I verified that brandname got searched successfully

@Brands-Invalid
Scenario: Search InValid Brand Name
Given I Launched the application
When I Hovered Over the Brands tab
And I Searched for a Invalid Brandname
Then I verified that brandname got searched successfully

@ABC
Scenario: ABC
Given I am A
When I am B
Then I get c
