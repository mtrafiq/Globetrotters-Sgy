@TC005
Feature: User is able to Signup as a student using given access code

  Scenario: Positive test case
    Given User is on home page
    When User clicks on signup link
    And User clicks on Student link
    And User Enters given access code
    And User clicks on continue button
    And User completes form "George", "Mason", "gmason@gmu.edu", "gmu1234", "gmu1234"
    And User selects Date of birth June 15 1920 "June", 15, 05
    And User confirms that periodic schoology updates option is checked
    Then User made sure that Registeration button is Enabled
