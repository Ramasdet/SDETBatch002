Feature: HRM Login Retest

  Scenario Outline: Validate Login with different data
    Given launch hrm login page in any browser
    When enter "<UserName>" and "<Password>"
    When click on login button
    Then verify login success
    When click on Admin main module
    And click on user management sub module
    And click on users sub sub module
    And enter "<UN>" inside username field
    And enter "<EmpName>" inside employeename field
    And click on search button
    Then quit the entire browser

    Examples: 
      | UserName | Password | UN         | EmpName       |
      | Admin    | admin123 | Admin      | Paul Collings |
      | Admin    | admin123 | Cheeku     | Virat Kohli   |
      | Admin    | Admin123 | John.Smith | John Smith    |
