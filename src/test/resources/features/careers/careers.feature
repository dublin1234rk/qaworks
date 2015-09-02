  Feature: Careers Page
  
  As a job seeker
  I want to apply for jobs at QAWorks 
  
  Scenario: Careers at QAWorks
    Given I navigate to QAWorks site
    And I want to know more about QAWorks exciting services
    When I navigate to Careers section
    Then I should see the following tabs
      | Jobs            |
      | Back to Website |
      | Register        |
      | Log In          |
