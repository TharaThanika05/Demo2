Feature: 

#@ABC
# Scenario: ABC
# Given I am "Arthi"
# When I am B
# Then I get c

#/*@ABC
#Scenario Outline:: ABC
#Given I am "<NameOfPerson>"
#When I do B
#Then I get C

#Examples: 
#|NameOfPerson|
#|Praba| 
#|Priya|
#|Akshaya|

Scenario: ABC
Given I am reading a name and age
|Thara|20|
|Praba|21|
|Priya|22|
When I enter the above provided name 
Examples: 
|NameOfPerson|
|Praba| 
|Priya|
|Akshaya|
