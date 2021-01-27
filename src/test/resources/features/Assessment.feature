Feature: Assessment
  Scenario Outline: Ask a Doubt
    Given I am home page
    When Press Assessment navigation link
    Then User Should Navigate to Assessment page
    And Select Sem,Sub & Ass "<Sem>","<Sub>" and "<Ass>"
    Then Complete a Test
    Examples:
      | Sem | Sub | Ass |
      |Mech Semester 7|Robotics|Start Now|





































