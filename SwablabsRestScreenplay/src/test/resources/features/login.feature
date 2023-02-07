Feature: Login
  I as user
  I want sign in
  To obtain a token

  Scenario: login Success
    Given he user is in the web page
    When the user his login
    Then  the user obtain token
