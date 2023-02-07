Feature: Login
  I as a user
  want to login in the page
  and verify the information

  Scenario: Login Successful
    Given that the user enters the page of login in Conduit
    When the user logs in
      | email                  | password      |
      | scastanomo@yopmail.com | Sarcasmo1902* |

    Then the user name is checked