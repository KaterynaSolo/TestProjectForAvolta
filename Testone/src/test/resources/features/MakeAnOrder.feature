Feature: Making an order from the manu

  @order
  Scenario: Successful Burger Order

    Given the user is navigated to the website
    When the user wants to order burger and clicks on Smash Burger
    And the user clicks on Classic Smash
    And the user customizes his order by picking different ingredients
    And the user clicks on add to cart
    And the user clicks on cart button
    And the user clicks on pay now
    And the user enters payment information and clicks on pay button
    And the user enters his email address for e-receipt
    Then the user clicks send receipt button