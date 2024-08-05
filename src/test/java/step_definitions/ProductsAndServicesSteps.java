package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductsAndServicesPage;
import pages.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.SeleniumUtils;

public class ProductsAndServicesSteps {

    UserPage userPage = new UserPage();
    HomePage homePage = new HomePage();
    ProductsAndServicesPage productsAndServicesPage = new ProductsAndServicesPage();
    Faker faker = new Faker();
    WebDriver driver = Driver.getDriver();

    @Given("the user is on the Cashwise homepage")
    public void the_user_is_on_the_cashwise_homepage() {
        driver.get("https://cashwise.us/");
        homePage.login("vladtest@gmail.com", "123456");
    }

    @Given("the user clicks on the Sales Dropdown")
    public void the_user_clicks_on_the_sales_dropdown() {
        userPage.salesDropdown.click();
    }

    @Given("the user clicks on Products And Services")
    public void the_user_clicks_on_products_and_services() {
        userPage.productsAndServices.click();
    }

    @When("the user is on the products and services page")
    public void the_user_is_on_the_products_and_services_page() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://cashwise.us/dashboard/sales/products-and-services";
        Assert.assertEquals(expectedUrl,currentUrl);
    }

    @Then("they should see an empty list or a list of all products and services")
    public void they_should_see_an_empty_list_or_a_list_of_all_products_and_services() {
        Assert.assertTrue(productsAndServicesPage.emptyList.isDisplayed() || productsAndServicesPage.listOfProductsOrServices.isDisplayed());
    }

    @When("the user clicks on Add Product Or Service")
    public void the_user_clicks_on_add_product_or_service() {
        productsAndServicesPage.clickAddProductOrService();
    }

    @When("the user adds a new product or service with a random name and price")
    public void the_user_adds_a_new_product_or_service_with_a_random_name_and_price() {
        productsAndServicesPage.addProductOrService(faker.food().vegetable(), String.valueOf(faker.number().numberBetween(1,5000)),"product","test");

    }

    @Then("they should see a success alert")
    public void they_should_see_a_success_alert() {
        Assert.assertTrue(productsAndServicesPage.productAlert.isDisplayed());
    }

    @When("the user clicks on the Edit button for a product or service")
    public void the_user_clicks_on_the_edit_button_for_a_product_or_service() {
        productsAndServicesPage.editButton.click();
    }

    @When("the user changes the price to a random value")
    public void the_user_changes_the_price_to_a_random_value() {
        SeleniumUtils.waitForSeconds(1);
        SeleniumUtils.clear(productsAndServicesPage.priceInput);
        productsAndServicesPage.priceInput.sendKeys(String.valueOf(faker.number().numberBetween(1,5000)));
    }

    @When("the user saves the changes")
    public void the_user_saves_the_changes() {
        productsAndServicesPage.saveProductOrService.click();
    }

    @When("the user clicks on the Delete button for a product or service")
    public void the_user_clicks_on_the_delete_button_for_a_product_or_service() {
        productsAndServicesPage.deleteButton.click();
    }

    @When("the user confirms the deletion")
    public void the_user_confirms_the_deletion() {
        productsAndServicesPage.confirmDelete.click();
    }

    @When("the user adds a new product or service with a missing price")
    public void the_user_adds_a_new_product_or_service_with_a_missing_price() {
        String price = "";
        productsAndServicesPage.addProductOrService(faker.food().vegetable(),price,"product","test");
    }

    @Then("they should see an error message for the missing price")
    public void they_should_see_an_error_message_for_the_missing_price() {
        Assert.assertTrue(productsAndServicesPage.priceError.isDisplayed());
    }

    @When("the user clears the price field and leaves it empty")
    public void the_user_clears_the_price_field_and_leaves_it_empty() {
        String price = "";
        SeleniumUtils.waitForSeconds(1);
        SeleniumUtils.clear(productsAndServicesPage.priceInput);
        productsAndServicesPage.priceInput.sendKeys(price);
    }

    @Then("they should see an error message for the missing data")
    public void they_should_see_an_error_message_for_the_missing_data() {
        Assert.assertTrue(productsAndServicesPage.priceError.isDisplayed());
    }
}
