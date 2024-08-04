package step_definition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;
import utilities.Driver;

public class LoginTest {
    Faker faker = new Faker();
    String incorrectEmail = faker.internet().emailAddress();
    String incorrectPassword = faker.internet().password();
    WebDriver driver = new ChromeDriver();
    LogInPage logInPage = new LogInPage();
    String correctEmail = "saitegin05@gmail.com";
    String correctPassword = "codewise";



    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get("https://cashwise.us/main?showLogin=false");
        Driver.getDriver().manage().window().maximize();
    }

    @Then("user need to change language")
    public void user_need_to_change_language() {
        logInPage.languageButton.click();
        logInPage.laguageBtENG.click();
    }

    @When("user give correct email {string} and password {string}")
    public void user_give_correct_email_and_password(String correctEmail, String correctPassword) {
        logInPage.logIn(correctEmail, correctPassword);

    }

    @Then("user should be on login main page")
    public void user_should_be_on_login_main_page() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[text()=\"CodewiseTest\"]")).getText().equals("CodewiseTest"));

        //log outing
        logInPage.accountProfil.click();
        logInPage.logoutButton.click();
        logInPage.logoutAcceptButton.click();
    }

    @When("user give incorrect email {string} or password {string}")
    public void user_give_incorrect_email_or_password(String string, String string2) {
        logInPage.logIn(incorrectEmail,incorrectPassword);

    }

    @Then("user should stay on same page")
    public void user_should_stay_on_same_page() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h3[text()=\"Sign in\"]")).getText().equals("Sign in"));

    }

    @When("user click to forgotPassword")
    public void user_click_to_forgot_password() {
        logInPage.signIn.click();
        logInPage.forgotbutton.click();
    }

    @When("input email")
    public void input_email() {
        logInPage.forgotEmailInput.sendKeys(incorrectEmail);

    }

    @Then("user should get messege to reset password")
    public void user_should_get_messege_to_reset_password() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//p[text()=\"Ссылка для сброса пароля отправлена!\"]")).getText(),"Ссылка для сброса пароля отправлена!");

    }



    @When("user click to logout")
    public void user_click_to_logout() {
        logInPage.logout(correctEmail, correctPassword);
    }

    @Then("user should be on login page")
    public void user_should_be_on_login_page() {
        Assert.assertTrue(logInPage.signIn.isDisplayed());
    }

}
