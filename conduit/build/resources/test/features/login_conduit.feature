Feature: Login
  I as a user
  want to login in the page
  and verify the information

  Scenario: Login Successful
    Given that the user enters the page
    When the user logs in
      | email                  | password |
      | saracastanom@gmail.com | 123456   |

    Then the user name is checked