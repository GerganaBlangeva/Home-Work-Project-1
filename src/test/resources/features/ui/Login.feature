@UI
Feature: As a register user I want to login successfully

  Scenario: Successful Login with correct credentials
    Given I go to the SuT home page
    When I enter username "admin@automation.com"
    And I enter password "pass123"
    And I click on the login button
    Then I should see that I am successfully logged in


