Feature: Learn awesome data table

@scenarioA
Scenario: Single Row With no Header
 Given My credentials
 |vivek|Bhardwaj|
 
 @scenarioB
 Scenario: Multiple Row With no Header
 Given My credentials with Multiple Row With no Header
 |vivek|Bhardwaj|
 |kaku|Bhardwaj|
 
 @scenarioC
 Scenario: Map Data Table directly with domain object
  Given My credentials with Map Data Table directly with domain object
 |vivek|Bhardwaj|
 |kaku|Bhardwaj|
 
 @scenarioD
 Scenario: Multiple Rows with Header
  Given My credentials with Multiple Rows with Header
 |username|password|
 |vivek|Bhardwaj|
 |kaku|Bhardwaj|
 
 
 @scenarioE
 Scenario: Multiple Rows with Header with Map
  Given Map Data Table directly with domain object with Map
 |username|password|
 |vivekone|Bhardwaj|
 |kakuone|Bhardwaj|