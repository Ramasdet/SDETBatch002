Feature: Data Table Functionality

  Scenario: Validate Login with different data
    Given launch hrm login page in any browser
    When enter valid username and password as credentials
      | Admin | admin123 |
      | Admin | admin123 |
      | Admin | admin123 |
    When click on login button
    Then verify login success
    When click on Admin main module
    And click on user management sub module
    And click on users sub sub module
    And enter UN and EMPNAME inside username field
      | UN         | EMPName       |
      | Admin      | Paul Collings |
      | Cheeku     | Virat Kohli   |
      | John.smith | John Smith    |
    And click on search button
    Then quit the entire browser
