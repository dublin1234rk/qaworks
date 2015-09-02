Feature: Home Page
  
  As an end user
  I want a home page
  So that I can find about QAWorks

  Scenario: Display Home Page
    Given I am an end user
    When I navigate to QAWorks site
    Then I should see Welcome to QAWorks message