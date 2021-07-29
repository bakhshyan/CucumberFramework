Feature: As a user i want to get ability to use Docs pages

  @smoke
  Scenario: Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user click on the "Installation" item
    Then there are 10 items in the left-side menu
    And left-side menu contain the following links
      | Installation                |
      | Guides                      |
      | Professional                |
      | Cucumber                    |
      | Gherkin Syntax              |
      | Behavior-Driven Development |
      | Community                   |
      | Sponsors                    |
      | Tools                       |
      | Terminology                 |



