@searchorder
Feature:  Search and place the orders
Scenario Outline: Validate Search experience in both product and offer page

Given  User is on Greenkart landing page 
When User searched with shortname <Name> and extract the product name 
Then  User searched with same shortname <Name> and product should exists

Examples:
|Name|
|tom|
|Beet|

