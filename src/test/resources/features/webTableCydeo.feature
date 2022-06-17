@WebTableCydeo
Feature: User should be able to login using correct credentials

  Scenario Outline: User login successfully
    Given user goes to login page
    When user gives correct username "<username>"
    And user gives correct password "<password>"
    Then url should end with orders

    Examples:
      | username | password |
      | Test     | Tester   |
      | Asd      | ASD      |


    Scenario Outline: User login successfully
      Given user goes to login page
      When user gives username "<username>" password "<password>"
      Then url should end with orders

      Examples:
        | username | password |
        | Test     | Tester   |

    @wip
  Scenario: User should be able to see all 12 months in months dropdown
    Given user goes to login page
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then url should end with orders