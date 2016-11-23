Feature: User is able to Signup as a student using given access code.

  @positivetest
  Scenario: Positive test case
    Given User is on home page
    When User clicks on signup link
    And User clicks on Student link
    And USer Enters given access code "PVTWZ-GDCRN"
    And User clicks on continue button
    And User completes form as "George", "Mason", "gmason@gmu.edu", 1234, 1234
    And User selects Date of birth "June", 15, 1920
    And User confirms that periodic schoology updates option is checked
    Then User made sure that Registeration button is clickable
