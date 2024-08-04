package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class CheckSteps {

    WebDriver driver = Driver.getDriver();
    CheckPage checkPage = new CheckPage();
    SeleniumUtils seleniumUtils = new SeleniumUtils();
    Faker faker = new Faker();

    @Given("user login ")
    public void user_log_in(String LogIn){


    }

    @When("user comes to expences page")
    public void user_comes_to_expences_page() {
        checkPage.report.click();

    }
    @When("user selects to Checks")
    public void user_selects_to_checks() {
      checkPage.checkButton.click();
    }
    @When("user adds an account")
    public void user_adds_an_account() {
     checkPage.addCheck.click();
    }
    @When("user inputs name {string}")
    public void user_inputs_name(String name) {
        checkPage.titleButton.sendKeys(name);

    }
    @When("user inputs comments {string}")
    public void user_inputs_comments(String comments) {
        checkPage.commentBox.sendKeys(comments);

    }

    @When("user adds the date {string}")
    public void user_adds_the_date(String date) {
        checkPage.dueDateButton.sendKeys(date);

    }
    @When("user clicks Add button")
    public void user_clicks_add_button() {
        checkPage.addButton.click();

    }

    @When("confirm the message  {string}")
    public void confirm_the_message(String message) {
       String expected "The invoice was successfully created";
        Assert.assertFalse();

    }

    @When("close the browser")
    public void close_the_browser() {
        Driver.quitDriver();
    }
}