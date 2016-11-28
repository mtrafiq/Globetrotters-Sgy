@TC002
Feature: User is able to filter resources by research type.

  Scenario: Positive test case
    Given User is on home page
    When User clicks on resources link
    And User checks the research under Type
    Then User validates the presence of Research keyword in result
