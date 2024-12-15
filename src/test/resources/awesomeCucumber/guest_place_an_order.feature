Feature: Pace an order

Scenario:using defaul payment option
Given I'm a guest customer
And My billing details are
|firstname|lastname|country|address_line1|city|state|zip|email|
|demo|user|US|street|plan|Test|55024|askdemo@mail.com|
And I have a product in the cart
And I'm on checkout page
When I provide billing details
And I verify the added product
And I place an order
Then The order should be placed successfully