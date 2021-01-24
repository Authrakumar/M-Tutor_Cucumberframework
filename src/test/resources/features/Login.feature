#Feature: Login Page
#
#Scenario:Check the Login link
#  Given I am on Landing Page
#  When  Press Login Button
#  Then  User Should Navigate to Login page
#
#  Scenario:Check the Login link
#    Given Press Landing Page Login Button then User should navigate to Login page
#    When  Press Signup link Button
#    Then  User Should Navigate to Signup page
#
#  Scenario:Check the Forgot link
#    Given Click Landing Page Login Button User Should Navigate to Login page
#    When  Press Forgot link Button
#    Then  User Should Navigate to Forgot page
#
#  @loginwithinputs
#  Scenario Outline: login with valid & invalid credentials
#    Given Landing Page Login Button clicks User Should Navigate to Login page
#    When  Enter Credentials as "<Mobile>" & "<password>" then press Login Button
#    Then  IF User enters valid user credentials navigate to home page else error thrown "<scenario type>"
#  Examples:
#    |   Mobile  | password | scenario type|
#    |8667651940 | uk123  |  valid       |
#    |80722438 | abc123  | Mobincorrect  |