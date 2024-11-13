package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class OpenThePageSteps extends CommonMethods {

    @Given("the user is navigating to the website of the bank")
    public void the_user_is_navigating_to_the_website_of_the_bank() {
       openBrowserAndLaunchApplication();

    }
    @When("the user clicks on the open the link")
    public void the_user_clicks_on_the_open_the_link() {
        System.out.println("It s implemented");

    }
    @Then("the user is navigated ti the website")
    public void the_user_is_navigated_ti_the_website(){
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        Assert.assertTrue(loginButton.isDisplayed());

    }
}
