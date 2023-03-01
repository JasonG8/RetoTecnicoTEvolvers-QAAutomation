Feature: I as user of the DemoBlaze Page
  I want to buy products and check their price

  Scenario: Successful purchase of products
    Given user navigate to home page
    When user adds products to shopping cart
    And validate that the total price is equal to the sum of all products
    Then the user makes a successful purchase