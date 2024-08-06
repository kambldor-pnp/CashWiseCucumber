package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LogInPage;
import utilities.Driver;

public class LogInSteps {
    WebDriver driver = Driver.getDriver();

    HomePage homePage = new HomePage();
    LogInPage logInPage  = new LogInPage();

    @Given("user is on {string}")
    public void user_is_on(String url) {
        driver.get(url);

    }
    @Given("user clicks on singIn button")
    public void user_clicks_on_sing_in_button() {
        logInPage.signIn.click();
    }
    @Given("user enters email {string}")
    public void user_enters_email(String email) {
        logInPage.emailInput.sendKeys(email);

    }
    @Given("user enters password {string}")
    public void user_enters_password(String password) {
        logInPage.passwordInput.sendKeys(password);

    }
    @Then("user clicks on login")
    public void user_clicks_on_login() {
    }
    }
