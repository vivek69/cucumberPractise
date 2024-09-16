@featureTag
Feature: dummy feature


  Scenario Outline: scenario4
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
    And I see 1 product in my cart
    And I see 2 products in my cart
    Examples:
		|product_name|
		| Blue Shoes|
		
