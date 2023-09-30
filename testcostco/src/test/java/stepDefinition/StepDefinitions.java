package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
// Initiate the Chrome-driver and open the browser.
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("User is on costco.com  page")
	public void user_is_on_google_search_page() {
// Navigate to google.com
		driver.navigate().to("https://costco.com");
	}
	
	@Given("I am on the Costco login page")
	public void i_am_on_the_costco_login_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.navigate().to(
				"https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_567/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=gyz7EzAtGkcFWbW5&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
	
	}

	@When("I enter my username and password")
	public void i_enter_my_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement username = driver.findElement(By.id("signInName"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("wesadaw201@utwoko.com");
        password.sendKeys("Qwerty123@");

	}

	@When("I click the Sign In")
	public void i_click_the_sSign_In_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement next = driver.findElement(By.id("next"));
        next.click();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
