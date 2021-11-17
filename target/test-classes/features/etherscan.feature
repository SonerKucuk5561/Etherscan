@wip
Feature:User should be able to search one item and register a new account.

  Background:
    Given the user navigate to the given page

  Scenario:Searching one item

    When the user writes one item on the search box
    And the user clicks the search button
    Then the URL should be changed

  Scenario: Creat a new account

    When the user writes a new user name on the Username box
    And the user writes a valid e-mail on the Email Address box
    And the user writes a valid password on the Password box
    And the user writes a same password on the Confirm Password box
    And the user accepts conditions button
    And the user clicks on the Create an Account button
    Then the user should be able to give a error message
