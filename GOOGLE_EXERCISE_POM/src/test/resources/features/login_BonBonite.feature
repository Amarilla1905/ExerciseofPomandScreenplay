Feature: Login

  I as user want login in the page of the Bonbonite

  Scenario Outline: Login in the page of the Bonbonite
  Given the user enters the bonbonite site
  When the user can access the bonbonite home page
    |id     |password         |
    | <id>  |<password>       |

  Then he will be able to verify his account

    Examples:
    |id        |   password    |
    |0123456789|Sarcasmo1902.* |