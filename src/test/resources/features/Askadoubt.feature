Feature: Ask Page

  Background: :Login
    Given I am on Landing Page and press Login button
    When Enter login valid Credentials "<username>" and "<password>"
    Then  User Should Navigate to the Home Page

  Scenario Outline: Ask a Doubt
    Given I am on home page
    When Press ask a Doubt navigation link
    Then User Should Navigate to ask a Doubt page
    And Select product,subject & Doubt "<product>","<Subject>" and "<Doubt>"
    And Add attachment "<attachment path>"
    Then Press Submit Button
    Examples:
      | product | Subject | Doubt |attachment path |
      |1        |1        |uk     |                |
      |2        |1        |uk     |                |
      |3        |1        |uk     |                |

