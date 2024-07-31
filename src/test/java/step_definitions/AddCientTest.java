package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddClientPage;
import pages.LogInPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AddCientTest {

    WebDriver driver = Driver.getDriver();
    AddClientPage addClientPage= new AddClientPage();
    SeleniumUtils seleniumUtils = new SeleniumUtils();
    Faker faker = new Faker();


    @When("user clicks on sales button")
    public void user_clicks_on_sales_button() throws InterruptedException {
       addClientPage.sales.click();

    }
    @When("user clicks on Add client")
    public void user_cliks_on_add_client() {
        addClientPage.addClient.click();

    }
    @When("user clicks on select tag")
    public void user_clicks_on_select_tag() {
        addClientPage.selectTag.click();

    }
    @When("user clicks on create new tag")
    public void user_cliks_on_create_new_tag() {
        addClientPage.createTag.click();


    }
    @When("user inputs tag name")
    public void user_inputs_tag_name() {
        addClientPage.tagName.sendKeys(faker.name().firstName());

    }
    @When("user clicks on save")
    public void user_cliks_on_save() {
        addClientPage.saveButton.click();

    }
    @When("user clicks on tag")
    public void user_clicks_on_tag() {
        addClientPage.selectTag.click();


    }
    @When("user selects created tag")
    public void user_selects_created_tag() {
        addClientPage.defaultTag.click();

    }
    @When("user inputs company name")
    public void user_inputs_company_name() {
        addClientPage.companyName.sendKeys(faker.name().fullName() + " LLC ");

    }
    @When("user inputs user name")
    public void user_inputs_user_name() {
        addClientPage.clientFullName.sendKeys(faker.name().fullName());

    }
    @When("user inputs email")
    public void user_inputs_email() {
        addClientPage.clientEmail.sendKeys(faker.internet().emailAddress());

    }
    @When("user inputs phone number")
    public void user_inputs_phone_number() {
        addClientPage.clientPhone.sendKeys(faker.phoneNumber().cellPhone());

    }
    @When("user inputs address")
    public void user_inputs_address() {
        addClientPage.clientAddress.sendKeys(faker.address().fullAddress());

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        addClientPage.saveClientButton.click();

    }
    @Then("verify client info is displayed")
    public void verify_client_info_is_displayed() {
        Assert.assertTrue(addClientPage.clientInfo.isDisplayed());
    }



    @When("user inputs email {string}")
    public void user_inputs_email(String emailWrong) {
        addClientPage.clientEmail.sendKeys(emailWrong);


    }
    @When("user inputs phone number {string}")
    public void user_inputs_phone_number(String phoneNumber) {
        addClientPage.clientPhone.sendKeys(phoneNumber);
    }
    @Then("verify error message is displayed")
    public void verify_error_message_is_displayed() {
      Assert.assertTrue(addClientPage.errorNameMessage.isDisplayed());
    }


    @When("user click on check all button")
    public void user_click_on_check_all_button() {
        addClientPage.checkAll.click();

    }
    @Then("verify all tags are selected")
    public void verify_all_tags_are_selected() {
       Assert.assertTrue(addClientPage.checkboxes.isSelected());

    }


    @When("user clicks on archive all button")
    public void user_clicks_on_archive_all_button() {
        addClientPage.archiveAll.click();

    }
    @Then("verify that list of clients is empty")
    public void verify_that_list_of_clients_is_empty() {
       Assert.assertTrue(addClientPage.emptyMessage.isDisplayed());

    }








}
