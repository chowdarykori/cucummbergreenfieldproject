package greenfield1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class greenfieldtest {

    @Given("^I navigate to the login page$")
    public void i_navigate_to_the_login_page() throws Throwable {
        System.out.println("^ I navigate to the login page $");
    }

    @Given("^I enter the username as admin and password as admin$")
    public void i_enter_the_username_as_admin_and_password_as_admin() throws Throwable {
        System.out.println("^I enter the username as admin and password as admin $");
    }

    @Given("^I click login$")
    public void i_click_login() throws Throwable {
        System.out.println("^I click login $");

    }

    @Then("^I should see the username and login$")
    public void i_should_see_the_username_and_login() throws Throwable {
        System.out.println("^ I should see the username and login$");
    }

}
