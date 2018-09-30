#Author: shivam9rnaldo7@gmail.com

@tag
Feature: Test Google application
  I want to use feature file to test google application

  @tag1
  Scenario: Test google search bar
    Given I want to open "www.google.com"
    And search "Google" on the navigation bar
    When I click on the search button
    Then result is dsplayed
    And 9 search link i.e. result is displayed