@TC001
Feature: User is able to Request a tour as a corporation

  Scenario: Positive test case
    Given User is on home page
    When User click corporate link by hovering over tour link
    And User enters first name and last name "George", "Mason"
    And User selects manager option from job function dropdown
    And User Enters Phone, email address and company name "7031234567", "gmason@gmu.edu", "Globetrotters"
    And User selects 501, 2,000 option from employees size dropdown 2
    And User selects country from country dropdown "United States"
    And User enters comments "This is a successfull execution of TC001 "
    Then User confirms that submit button is enabled
