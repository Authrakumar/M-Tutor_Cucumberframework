Feature: QB Page

Scenario Outline:Login
  Given I am on Landing Page & press Login button
  When Enter login valid login Credentials "<username>" and "<password>"
  Then  User Should Navigate to Home Page
Examples:
  |username|password|
  |8667651940|uk123 |

