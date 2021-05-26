@UI
Feature: Register as a new user successfully

  Scenario: Successful register
    Given I go to the SuT home page
    When I click Register form
    And I set title Mrs.
    And I enter First Name "Gerganaa"
    And I enter Sir Name "Blangevaa"
    And I enter email "abv@abv1"
    And I enter registerpassword "1234561"
    And I enter country "Bulgariq"
    And I enter City "Sofiq"
    And I click on I agree with terms of service
    And I click on the register button
    Then I should see that I have successful registration


