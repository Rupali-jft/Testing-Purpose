package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LoginPage;

public class Login_Step_Def  {
    static WebDriver driver;
    LoginPage login_Page= PageFactory.initElements(driver,LoginPage .class);
    @Given("^I am on the login page of Gmail$")
    public void i_am_on_the_login_page_of_Gmail() throws Throwable {
login_Page.navigate_To_Gmail();
    }
    @When("^Entering the valid Credentials username and password$")
    public void entering_the_valid_Credentials_username_and_password() throws Exception {
        login_Page.enterMailId("tdemo8388@gmail.com");
login_Page.enterPassword("rupal@1103");
    }

    @Then("^Click on Login button$")
    public void click_on_Login_button() throws Throwable {
login_Page.clickSignUPButton();
    }

    @Given("^I am on Gmail Home Page$")
    public void i_am_on_Gmail_Home_Page() throws Throwable {
login_Page.confirmLoginSuccessful();
    }

    @When("^Click on Compose icon$")
    public void click_on_Compose_icon() throws Throwable {
login_Page.clickComposeButton();
    }

    @Then("^Enter email address in To field$")
    public void enter_email_address_in_To_field() throws Throwable {
login_Page.enterReceiverEmail("tdemo8388@gmail.com");
    }

    @Then("^Subject in the subject field$")
    public void subject_in_the_subject_field() throws Throwable {
login_Page.enterSubject("Gmail mail");
    }

    @Then("^Write the body of the mail$")
    public void write_the_body_of_the_mail() {
login_Page.enterBody("Write email body here-");
    }

    @Then("^Click on Send button$")
    public void click_on_Send_button(){
login_Page.sendTheMail();
    }

}
