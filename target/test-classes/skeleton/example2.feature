Feature: Example mapping

Scenario: User moves to the cart without adding products to the cart

Given User is registered to TestMe App
When User searches for a headphones
And Proceed to payment process without adding products to the cart
Then TestMe App does not display the cart icon