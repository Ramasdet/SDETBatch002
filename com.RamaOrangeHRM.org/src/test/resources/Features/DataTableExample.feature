 Feature: Datatable functionality

  Scenario: Login functionality
    Given open the ohrm login page in chrome browser
    When enter valid username and password as credentials
      | UserName | Password |
      | Admin    | admin123 |
    When click on login button in login page
    Then verify dashboard is appearing
    Then quit the entire browser
