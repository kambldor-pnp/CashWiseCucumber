package step_definitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.InvoiceReportingPage;
import utilities.Driver;

public class CashwiseInvoiceSteps {

    WebDriver driver = Driver.getDriver ();
    HomePage homePage = new HomePage ();
    Faker faker = new Faker();
    InvoiceReportingPage invoiceReportingPage = new InvoiceReportingPage ();


    @Given("the user is on the Cashwise homepage")
    public void the_user_is_on_the_cashwise_homepage() {
        driver.get("https://cashwise.us/");
        homePage.login("vladtest@gmail.com", "123456");
    }

    @Given ("User clicks on the Sales tab")
    public void user_clicks_on_the_sales_tab () {
        invoiceReportingPage.sales.click ();

    }

    @Given ("User clicks on the Invoice option")
    public void user_clicks_on_the_invoice_option () {
        invoiceReportingPage.invoice.click ();

    }

    @When("user navigates and clicks to Create invoice")
    public void user_navigates_and_clicks_to_create_invoice () {
        invoiceReportingPage.createInvoiceBtn.click ();
    }

    @And ("user verifies invoice creation link {string}")
    public void user_verifies_invoice_creation_link ( String arg0 ) {
        Assert.assertEquals ( "https://cashwise.us/dashboard/sales/invoice/create", arg0 );


    }

    @And("user types in Invoice name {string}")
    public void user_types_in_invoice_name ( String dfgfbbhgb ) {
        invoiceReportingPage.writeInvoiceNameInpt.sendKeys ( dfgfbbhgb );
    }

    @And("user types to Whom section {string}")
    public void user_types_to_whom_section ( String dfghjkl ) {
        invoiceReportingPage.writeToWhomInpt.sendKeys ( dfghjkl + Keys.ENTER );
    }

    @And("user types a date for section Pay until {string}")
    public void user_types_a_date_for_section_pay_until ( String string ) {
        invoiceReportingPage.payUntilDateInpt.click ();
        invoiceReportingPage.payUntilDateInpt.sendKeys ( string );
    }

    @And("user clicks to Select product and types {string} and press enter")
    public void user_clicks_to_select_product_and_types_and_press_enter ( String string ) {
        invoiceReportingPage.selectProductBtn.click ();
        invoiceReportingPage.stringForProduct.click ();
        invoiceReportingPage.saveBtnInvoice.click ();
    }

    @And("user lands on Invoice page and verifies created invoice")
    public void user_lands_on_invoice_page_and_verifies_created_invoice () {
        String invoiceNumb = invoiceReportingPage.numberOfInv.getText ().substring ( 6, 9 ).trim ();
        int invoiceNumbInt = Integer.parseInt ( invoiceNumb );
        for (WebElement element : invoiceReportingPage.invoices) {


            Assert.assertEquals ( invoiceNumbInt, invoiceReportingPage.invoices.size () );
        }
    }

    @Then("user tries to enter button save")
    public void user_tries_to_enter_button_save () {
        invoiceReportingPage.saveBtnInvoice.click ();

    }

    @When("user clicks on Accept payments")
    public void user_clicks_on_accept_payments () {

        invoiceReportingPage.numberOfInv.click ();
    }

    @And("user clicks to Select payment options")
    public void user_clicks_to_select_payment_options () {

        invoiceReportingPage.paymentDateInput.click ();
    }

    @And("user clicks to Select to whom option")
    public void userClicksExpenseCategoryOption () {
        invoiceReportingPage.paymentMethodsOption.click ();

    }

    @And("user clicks to Select income category")
    public void user_clicks_to_select_income_category () {

        invoiceReportingPage.incomeCategoryOption.click ();
    }

    @And("user fill in sum option")
    public void user_fill_in_sum_option () {

        invoiceReportingPage.expenseCategoryOption.click ();
    }

    @And("user clicks on save button")
    public void user_clicks_on_save_button () {

        invoiceReportingPage.SaveOption.click ();
    }

    @And("user clicks on add all invoices")
    public void user_clicks_on_add_all_invoices () {

        invoiceReportingPage.AddAllInvoices.click ();
    }

    @And("user clicks on paid button")
    public void user_clicks_on_paid_button () {

        invoiceReportingPage.PaidButton.click ();
    }

    @And("user click Show pdf document for invoice")
    public void user_click_show_pdf_document_for_invoice () {

        invoiceReportingPage.ShowPdfFile.click ();
    }

    @Then("user download an invoice document file")
    public void user_download_an_invoice_document_file () {

        invoiceReportingPage.DownloadInvoice.click ();
    }

}
