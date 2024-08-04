@invoice
  Feature:All tasks related to creating invoice functionality

    Background:
      Given the user is on the Cashwise homepage
      And User clicks on the Sales tab
      And User clicks on the Invoice option

    @positive
    Scenario:Create invoice functionality with all relevant credentials
      When user navigates and clicks to Create invoice
      And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
      And user types in Invoice name "dfgfbbhgb"
      And user types to Whom section "dfghjkl"
      And user types a date for section Pay until "08/03/2024"
      And user clicks to Select product and types "Red Cabbage" and press enter
      And user lands on Invoice page and verifies created invoice
      Then user tries to enter button save

      @positive
      Scenario: to make payment and download invoice
        When user clicks on Accept payments
        And  user types a date for section Pay until "08/03/2024"
        And user clicks to Select payment options
        And  user clicks to Select income category
        And user clicks to Select to whom option
        And user fill in sum option
        And user clicks on save button
        And user clicks on add all invoices
        And user clicks on paid button
        And user click Show pdf document for invoice
        Then user download an invoice document file
















