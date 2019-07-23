Feature: Search
  In order to select a tool
  As a user
  I want to search for a tool

  Rules:
  * The user must be able to search for a tool
  * All correct tools are returned after search
  * The user should be able to select a tool


@search-tool
Scenario: a user searches for a new tool
Given I have logged in
When I search for a new tool
Then I see a list of all possible tools

  @select-tool
  Scenario: user selects tool
    Given I have searched for a tool
    When I select a tool
    Then the tool is added to my list