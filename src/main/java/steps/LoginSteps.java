package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        System.out.println("User Navigates to "+string);
    }
    @Given("user enters {string} username")
    public void user_enters_username(String string) {
        System.out.println("User Navigates to "+string);
    }
    @Given("user enters {string} password")
    public void user_enters_password(String string) {
        System.out.println("User Navigates to "+string);
    }
    @Given("user clicks Login button")
    public void user_clicks_login_button() {
        System.out.println("User Navigates to ");
    }
    @Then("verify that user is logged in and navigated to Profile page")
    public void verify_that_user_is_logged_in_and_navigated_to_profile_page() {
        System.out.println("User Navigates to ");
    }

}
