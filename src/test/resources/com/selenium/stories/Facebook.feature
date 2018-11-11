#Author: shivam9rnaldo7@gmail.com

@Facebook
Feature: Test Facebook application
  I want to test Facebook application

  @CreateAccount
  Scenario: Test facebook create account functioality
    Given I want to open "https://www.facebook.com"
    When facebooks landing page loads with title "Facebook – log in or sign up"
    And user enters first name as "Shivam"
    And user enters last name as "Singh"
    And user enters mobile number as "8686288691"
    And user enters password as "qwerty@12345"
    And user enters dob date as "1"
    And user enters dob month as "12"
    And user enters dob year as "1990"
    And user clicks gender as "Male"
    Then clicks sign up button
    And page to enter FB otp is loaded
    