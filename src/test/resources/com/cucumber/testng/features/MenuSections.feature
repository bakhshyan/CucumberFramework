Feature: As a user i want to get ability to use menu sections

  @smoke
  Scenario Outline: Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user click on the "<title>" item
    Then page with title "<title>" is displayed
    Examples:
    |title  |
    |Gherkin Syntax |
    |Installation |