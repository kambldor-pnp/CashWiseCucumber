package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CashWiseHomePage;
import pages.SellerPage;
import utilities.Driver;

public class AddSeller {
    WebDriver driver = Driver.getDriver();
    CashWiseHomePage homePage = new CashWiseHomePage();
    SellerPage seller = new SellerPage();
    Faker faker = new Faker();
    String name = faker.name().fullName();
    int numberAddress = faker.number().numberBetween(1,999);
    String address = numberAddress+ " " + faker.name().firstName();
    String email = "@gmail.com";
    String ganareteEmail = faker.name().username()+email;
    String title = faker.name().title();
    String number = numberAddress+""+numberAddress+""+numberAddress+""+"2";




    @Given("User goes to the url {string}")
    public void user_goes_to_the_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        homePage.signInButton.click();

    }
    @Then("user click on username {string}")
    public void user_click_on_username(String userName) {
    homePage.emailInput.sendKeys(userName);
    }
    @Then("user click on password {string}")
    public void user_click_on_password(String password) {
      homePage.passwordInput.sendKeys(password);
    }
    @Then("user click on sign in")
    public void user_click_on_sign_in() {
      homePage.signInBtnInForm.click();
    }
    @Then("user clicks on Expensess")
    public void user_clicks_on_expensess() {
        seller.expenses.click();
    }
    @Then("user clicks on seller")
    public void user_clicks_on_seller() {
       seller.seller.click();
    }
    @Then("user clicks on add Seller")
    public void user_clicks_on_add_seller() {
        seller.addSeller.click();
    }
    @Then("user input title {string}")
    public void user_input_title(String title) {
        String titleName = faker.name().title();
        seller.writeTitle.sendKeys(titleName);
    }
    @Then("user input full name {string}")
    public void user_input_full_name(String fullName) {

        seller.fullName.sendKeys(name);
    }
    @Then("user input Email {string}")
    public void user_input_email(String email) {
        String email1 = "@gmail.com";
        String ganareteEmail = faker.name().username()+email1;
        seller.email.sendKeys(ganareteEmail);
    }
    @Then("user input phoneNumber {string}")
    public void user_input_phone_number(String phonenumber) {
        int numberAddress = faker.number().numberBetween(1,999);
        String number = numberAddress+""+numberAddress+""+numberAddress+""+"2";
        seller.phoneNumber.sendKeys(number);
    }
    @Then("user input address {string}")
    public void user_input_address(String string) {
        int numberAddress = faker.number().numberBetween(1,999);
        String address = numberAddress+ " " + faker.name().firstName();
        seller.enterAddress.sendKeys(address);
    }
    @Then("user click save")
    public void user_click_save() {
      seller.save.click();
    }
    @Then("user verify seller was added")
    public void user_verify_seller_was_added() {
        seller.verifyName(seller.table.getText());
    }
    @Then("user input Wrong full-name {string}")
    public void user_input_wrong_full_name(String fullName) {
      seller.fullName.sendKeys(fullName);
    }
    @Then("user verify error message")
    public void user_verify_error_message() {
        Assert.assertTrue(seller.alertMessage.isDisplayed());
    }
    @Then("user clicks on search bar")
    public void user_clicks_on_search_bar() {
      seller.searchBar.click();
    }
    @Then("user will input a seller name")
    public void user_will_input_a_seller_name() {
        seller.nameToSearch();
    }
    @Then("user input wrong seller name {string}")
    public void user_input_wrong_seller_name(String name) {
        seller.enterName(name);
    }
    @Then("user close the browser")
    public void user_close_the_browser() {
        Driver.quitDriver();
    }
}
