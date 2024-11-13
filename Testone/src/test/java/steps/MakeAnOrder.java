package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class MakeAnOrder extends CommonMethods {

    @Given("the user is navigated to the website")
    public void the_user_is_navigated_to_the_website() {
        openBrowserAndLaunchApplication();
    }
    @When("the user wants to order burger and clicks on Smash Burger")
    public void the_user_wants_to_order_burger_and_clicks_on_smash_burger() {
        WebElement smashBurger=driver.findElement(By.xpath("(//div[@class='category-card'])[4]"));
        smashBurger.click();
    }
    @When("the user clicks on Classic Smash")
    public void the_user_clicks_on_classic_smash() {
        WebElement classicSmash = driver.findElement(By.xpath("(//li[@class='table-row category-menu-list'])[3]"));
        classicSmash.click();
    }
    @When("the user customizes his order by picking different ingredients")
    public void the_user_customizes_his_order_by_picking_different_ingredients() {
       WebElement classicBun = driver.findElement(By.xpath("(//li[@class='table-row condiment table-row--border-btm item-modifier-required'])[4]"));
       classicBun.click();
       WebElement doubleBeefPatty=driver.findElement(By.xpath("(//li[@class='table-row condiment table-row--border-btm item-modifier-required'])[7]"));
       doubleBeefPatty.click();
       WebElement singleBeefPatty =driver.findElement(By.xpath("(//li[@class='table-row condiment table-row--border-btm item-modifier-required'])[9]"));
       singleBeefPatty.click();
    }
    @When("the user clicks on add to cart")
    public void the_user_clicks_on_add_to_cart() {
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='AddItem']"));
        addToCart.click();

    }
    @When("the user clicks on cart button")
    public void the_user_clicks_on_cart_button() {

        WebElement cartButton= driver.findElement(By.xpath("//*[@id='header-cart']/div"));
        //waitForElementToBeClickAble(cartButton);
        //cartButton.click();
        jsClick(cartButton);

    }

    @When("the user clicks on pay now")
    public void the_user_clicks_on_pay_now() {
        WebElement payNowButton = driver.findElement(By.xpath("//div[@class='PayNow']"));
        payNowButton.click();
    }
    @When("the user enters payment information and clicks on pay button")
    public void the_user_enters_payment_information_and_clicks_on_pay_button() {
        WebElement nameOnCard = driver.findElement(By.xpath("//div[@id='nameOnCardBlock']"));
        nameOnCard.sendKeys("Kat Solo");
        WebElement cardNumber =driver.findElement(By.xpath("//div[@class='control-container fp-hpc-input-container card-issuer-container']"));
        cardNumber.sendKeys("4111 1111 1111 1111");
        WebElement expirationDate = driver.findElement(By.xpath("(//div[@class='control-container fp-hpc-input-container'])[1]"));
        expirationDate.sendKeys("10/25");
        WebElement securityCode = driver.findElement(By.xpath("(//div[@class='control-container fp-hpc-input-container'])[2]"));
        securityCode.sendKeys("123");
        WebElement postalCode = driver.findElement(By.xpath("(//div[@class='control-container fp-hpc-input-container'])[3]"));
        postalCode.sendKeys("20876");
        WebElement payButton = driver.findElement(By.xpath("//button[@id='btnPay']"));
        payButton.click();
    }
    @When("the user enters his email address for e-receipt")
    public void the_user_enters_his_email_address_for_e_receipt() {
        WebElement emailBox= driver.findElement(By.xpath("//div[@class='input']"));
        emailBox.click();
        emailBox.sendKeys("katesolomoniuk01@gmail.com");
    }
    @Then("the user clicks send receipt button")
    public void the_user_clicks_send_receipt_button() {
        WebElement sendReceipt = driver.findElement(By.xpath("//button[@id='EmailReceipt']"));
        sendReceipt.click();
    }
}
