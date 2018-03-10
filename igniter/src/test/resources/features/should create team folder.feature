Feature: A new team is created

  Scenario: User selects to add a new team that has not previously been created
    Given The google drive api key is configured
    And The google drive secret key is configured
    When The user creates the team "Team 1"
    Then The google Drive folder of "Team 1" exists