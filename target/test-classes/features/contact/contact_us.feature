Feature: Contact Us Page
  
  As an end user
  I want a contact us page
  So that I can find out more about QAWorks exciting services

  Scenario: Valid submission
    Given I navigate to QAWorks site
    When I want to know more about QAWorks exciting services
    Then I should be able to contact QAWorks with the following information
      | name     | email                | message                                   |
      | J.Bloggs | J.Bloggs@qaworks.com | please contact me I want to find out more |
