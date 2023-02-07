Feature: BonBonite
  I as user want choose a product of category "Shoes" and add on the shopping cart

  Scenario: Buy Shoes
    Given that the user enters the website
    When the user chooses some product from the shoes category and adds it to the shopping cart
    Then the product is successfully added to the shopping cart