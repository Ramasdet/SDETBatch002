@EndToEnd
Feature: Datatable Example

  Background: This is hrm Background
    Given open hrm login page as precondition
    When do login

  @Smoke
  Scenario: Login Function
    Then verify login success or not

  @Smoke
  Scenario: Dashboard Function
    Then verify dashboard page

  @Regression
  Scenario: Logout Function
    Then verify profile button is appearing or not
