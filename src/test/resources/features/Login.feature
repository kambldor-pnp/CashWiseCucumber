@login
Feature:Login funtionality

Background:
  Given user is on "https://cashwise.us/main?showLogin=false"
  Then user need to change language

  @loginSucces
Scenario: Where user login succes
    When user give correct email "saitegin05@gmail.com" and password "codewise"
    Then user should be on login main page

    @logiUnsucces
    Scenario: Where user cannot succes login
      When user give incorrect email "email" or password "password"
      Then user should stay on same page

@forgotPassword
Scenario: When user reset password
  When user click to forgotPassword
  And input email
  Then user should get messege to reset password

  @logout
  Scenario: where user can log out from his login
    And user click to logout
    Then user should be on login page

