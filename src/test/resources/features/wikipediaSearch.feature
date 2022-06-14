@Wikipedia
Feature: Wikipedia search functionality


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

    @outline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header


    Examples: search values

      | searchValue  | expectedTitle | expectedMainHeader |
      | Chuck Norris | Chuck Norris  | Chuck Norris       |
      | Ronaldo      | Ronaldo       | Ronaldo            |
      | Nolan        | Nolan         | Nolan              |

















