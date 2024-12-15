
Feature: dummy feature
	@featureTag
 Rule: Rule1
  @scenarioOne
  Scenario Outline: scenarioOne
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
    And I see 1 product in my cart
    And I see 2 products in my cart
    @stage
    Examples:
		|product_name|
		| Blue Shoes|
		
		 @prod
    Examples:
		|product_name|
		| Red Shoes|


  Scenario Outline: scenario 2 
    Given I am on the product page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
    And I see 1 product in my cart
    And I see 2 products in my cart
    Examples:
		|product_name|
		| Red Shoes|

		
		
 Rule: Rule 2

  Scenario Outline: scenario 3 
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
    And I see 1 product in my cart
    And I see 2 products in my cart
    Examples:
		|product_name|
		| Blue Shoes|
		
		