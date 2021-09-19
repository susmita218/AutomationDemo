package stepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
    	System.out.println("code to navigate to login url");
        //code to navigate to login url
    }

    @When("^user login into application with user name and password$")
    public void user_login_into_application_with_user_name_and_password() throws Throwable {
        //code to login
        System.out.println("Login success");
    }

   
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
          //code of home page validation
    	System.out.println("Validated home page");
    }

    @And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String s) throws Throwable {
    //validating the cards
    	System.out.println(s);
    
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    
}