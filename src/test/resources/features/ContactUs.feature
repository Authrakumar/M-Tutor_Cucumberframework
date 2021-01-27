Feature: Contactus
  Scenario Outline: Check Contactus
    Given I am on Index Page
    When Press Contactus link i Headertab
    Then User Should Navigate to Contactus Page
    Then Enter First,Last,Email,Mob & Message "<first>","<last>","<Email>","<Mob>" and "<Message>"
    And Press Submit Button
    Examples:
      | first | last | Email | Mob | Message |
      |       |      |       |     |         |

