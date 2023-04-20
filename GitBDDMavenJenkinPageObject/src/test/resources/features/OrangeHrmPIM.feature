Feature: Test PIM functionality of OrangeHRM application

  Background: 
    Given user is already in OrangeHRM login page
    And logged in with valid username and password
    And click on PIM link

  Scenario: Verify PIM creation
  Given user is already in OrangeHRM login page
    And logged in with valid username and password
    And click on PIM link
    When user clicks on add button
    And enters firstname, lastname, empId and click on save button
    And click on PIM link
    And enter created empId in employee id input field
    And click on search button
    Then user should be able to search newly added employee

  Scenario: Verify PIM modification
    When enter created empId in employee id input field
    And click on search button

  Scenario: Verify PIM deletion
