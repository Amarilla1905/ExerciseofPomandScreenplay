Feature: Conduit
  I as a user
  want to register
  and verify the information

  Scenario: Forms register successful
    Given that the user enters the page
    When the user adds the data
      | username     | email                    | password      |
      | andresfelipe | andresfelipe@yopmail.com | Sarcasmo1905* |
    Then it will be checked that it has been saved


