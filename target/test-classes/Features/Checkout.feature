
@placeorder
Feature: Search and add the products to the cart
  
  Scenario Outline: Validate Checkout functionality in checkout page
    Given User is on Greenkart landing page 
    When User searched with shortname <Name> and extract the product name 
    And Added "3" items of the selected product to cart
    Then check same product <Name> should be visible under product name column in the checkout page 
    And check whether user is able to apply promocode and place the order
  
Examples:
|Name|
|Tomato|