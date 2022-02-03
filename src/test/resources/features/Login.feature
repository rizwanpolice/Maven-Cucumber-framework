#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Login @All @Everyfeature
Feature: Login functionality in demoqa application

Background:
	Given I launch the demoqa website


  @Login1 @PositiveLogin @regression
  Scenario: Successful login
  	When I enter username
    And I enter password
    And I click login button
    Then I see the home page
    #And I click on logout button
    
    #But
    #* 
    
  @Login2 @NegativeLogin
  Scenario: Failure login
    When I enter invalid username
    And I enter invalid password
    And I click login button
    Then I should see the error message
    #And I click on logout button
    
 @Login3 @MultipleLogin
  Scenario Outline: Successful login with examples
    When I enter username "<User>"
    And I enter password "<Pass>"
    And I click login button
    Then I see the home page
    
    Examples:
    |User      |Pass           |
    |RizwanDemo|TestPassword@1 |
    |RizwanDemo1|TestPassword@1|

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
