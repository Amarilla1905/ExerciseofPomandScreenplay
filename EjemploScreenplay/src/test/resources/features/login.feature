@Login
Feature: login
  I as a service, i need log in into page swablab

  Scenario: Login Successful

    Given he user is in the web page
    When the user his login
      | user          | password     |
      | standard_user | secret_sauce |
    Then  he user could see user

