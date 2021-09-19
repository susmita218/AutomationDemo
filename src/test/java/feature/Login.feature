
@tag
Feature: Application Log in
  I want to use this template for my feature file

  @tag1
  Scenario: Home page default login
    Given User is on net banking landing page
    When user login into application with "sus" and "123"
    Then Home page is populated
    And cards are displayed "true"
    
      @tag3
  Scenario: Home page default login
    Given User is on net banking landing page
    When user login into application with "mou" and "456"
    Then Home page is populated
    And cards are displayed "false"

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
