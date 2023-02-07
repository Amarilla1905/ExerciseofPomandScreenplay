Feature: Login
  I as service user, need login

  Scenario: Login Successful
    Given the user is on the page
    When he user enter credentials
      | username | scastano |
      | password | j2ee     |
    Then successful entry
