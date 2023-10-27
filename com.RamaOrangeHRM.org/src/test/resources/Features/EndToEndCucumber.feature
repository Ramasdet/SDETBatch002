@Flow
Feature: Directory end to end flow

  Background: This is hrm Background
    Given open hrm login page as precondition
    When click on login

  @Real
  Scenario: directory functionality
    When click on Directory module
    When enter validname in employname field
    And enter JobTitle in job Title field
    And enter Location in location field
    And click on search button
    Then verify any records are appearing or not
