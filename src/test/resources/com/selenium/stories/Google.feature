#Author: shivam9rnaldo7@gmail.com

@Google
Feature: Test Google application
  I want to use feature file to test google application

  @Regression
  Scenario: Test google search bar
    Given I want to open "www.google.com"
    And search "Google" on the navigation bar
    When I click on the search button
    Then result is displayed