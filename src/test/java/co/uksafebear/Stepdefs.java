package co.uksafebear;

import co.uksafebear.pages.LoginPage;
import co.uksafebear.pages.ToolsPage;
import co.uksafebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setUp(){
        //get the driver for the browser
        driver = Driver.getDriver();

        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);

        //navigate to the url of our webpage
        driver.get(Driver.getUrl());

    }

    @After
    public void tearDown(){
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Given("I am logged out")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    @Given("I have logged in")
    public void i_have_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I search for a new tool")
    public void i_search_for_a_new_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I see a list of all possible tools")
    public void i_see_a_list_of_all_possible_tools() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I have searched for a tool")
    public void i_have_searched_for_a_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I select a tool")
    public void i_select_a_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the tool is added to my list")
    public void the_tool_is_added_to_my_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
