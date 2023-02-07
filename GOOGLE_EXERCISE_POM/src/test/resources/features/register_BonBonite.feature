Feature: BonBonite
  I as user want register  correctly in the page of Bonbonite

  Scenario Outline: Register in the page of Bonbonite
    Given that he enters the website of Bonbonite
    When he fills in the following data of the form
      |id    |email     |password         |
      | <id> |<email>   |<password>       |
    Then he will be successfully registered


    Examples:
      |id          |email                       |password              |
      | 0123456789 |saracastano19@yopmail.com   | Sarcasmo1902.*       |