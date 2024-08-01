@ProductsAndServices
Feature: Cashwise products and services page functionalities

  Background:
    Given the user is on the Cashwise homepage
    And the user clicks on the Sales Dropdown
    And the user clicks on Products And Services

  @positive
  Scenario: User views products and services
    When the user is on the products and services page
    Then they should see an empty list or a list of all products and services

  @positive
  Scenario: User adds a product or service
    When the user clicks on Add Product Or Service
    And the user adds a new product or service with a random name and price
    Then they should see a success alert

  @positive
  Scenario: User edits a product or service
    When the user clicks on the Edit button for a product or service
    And the user changes the price to a random value
    And the user saves the changes
    Then they should see a success alert

  @positive
  Scenario: User deletes a product or service
    When the user clicks on the Delete button for a product or service
    And the user confirms the deletion
    Then they should see a success alert

  @negative
  Scenario: User attempts to add a product or service with missing fields
    When the user clicks on Add Product Or Service
    And the user adds a new product or service with a missing price
    Then they should see an error message for the missing price

  @negative
  Scenario: User attempts to edit a product or service with invalid data
    When the user clicks on the Edit button for a product or service
    And the user clears the price field and leaves it empty
    And the user saves the changes
    Then they should see an error message for the missing data