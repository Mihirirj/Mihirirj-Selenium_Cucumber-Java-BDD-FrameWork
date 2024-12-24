Feature: features to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    When user is on google search page
    And user enters a text in search box
    And his enter
    Then user is navigated to search results
    
    
