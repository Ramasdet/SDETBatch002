Feature: OHRM Login

  Scenario: Validate OHRM login
    Given launch hrm login page in any browser
    When enter "Admin" and "admin123"
    When click on login button
    Then verify login success
    Then quit the entire browser

  Scenario: Validate OHRM Logout
    Given launch hrm login page in any browser
    When enter "Admin" and "admin123"
    When click on login button
    Then verify login success
    When click on profile
    When click on logout button
    Then quit the entire browser
    
