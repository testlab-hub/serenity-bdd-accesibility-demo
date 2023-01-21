Feature: Login


  Scenario: Successful Login with Valid Credentials
    Given Sergey navigates to the OrangeHRM website
    When he enters Username as "Admin" and Password as "admin123"
    And Click on Login
    Then he should see OrangeHRM banner on Dashboard page