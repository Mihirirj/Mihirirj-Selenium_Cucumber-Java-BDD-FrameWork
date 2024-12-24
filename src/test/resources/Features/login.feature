

Feature: feature to test login functionality


  Scenario: cheak login is successful with valid credential
    Given user is on login page
    When user enters username and password
    And clicks on loggin button
    Then user is navigated to the homepage

  
