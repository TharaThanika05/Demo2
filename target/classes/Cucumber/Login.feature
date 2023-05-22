Feature: Login Feature

Scenario Outline: Login with valid Credentials
Given I launched the application
When I clicked on enter the store
When I clicked on signIn button
Then I enter the username "<username>"
And I enter the password  "<password>"
And I click on login button
And I verified Login successfully

Examples:

|username|password|
|j2ee|j2ee|

@Fish
Scenario: Fish
Given Login and find the Fish button
When I clicked on Fish
And I clicked on F1-SW-01
And I clicked on EST-1
And I clicked Add to cart
And I clicked on proceed to checkout
And I clicked on continue
And I clicked on confirm
Then I closed the Fish app

@Birds
Scenario: Birds
Given Login and find the Birds button
When I clicked on Birds
And I clicked on AV-CB-one
And I clicked on EST-eighteen
And I clicked Add to cart
And I clicked on proceed to checkout
And I clicked on continue
And I clicked on confirm
Then I closed the Birds app
