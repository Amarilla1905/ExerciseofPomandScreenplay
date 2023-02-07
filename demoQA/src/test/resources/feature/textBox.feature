Feature: Demo QA
I as a user
want to register
and verify the information
Scenario Outline: Enter data Text Box
 Given the user enters the page
 When the user fills in the fields
   | username | email | currentaddress |  permanentaddress|
   | <username> | <email> | <currentaddress> |  <permanentaddress>|


  Then it is verified if the information is saved
  Examples:

    | username | email                   | currentaddress | permanentaddress |
    | Sara     | saracastano@gmail.com   | Crr 67 A # 41  | Crr 67 A # 41    |
    | Alexis   | alexiscastano@gmail.com | Crr 68 A # 42  | Crr 68A # 42     |

