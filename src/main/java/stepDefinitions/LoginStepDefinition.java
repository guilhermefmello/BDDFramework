package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

	WebDriver driver;

	// Method for when the user is on the login page
	@Given("^user is on Login page$")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
	}

	// Method to get the title of login page
	@When("^title of login page is swaglabs$")
	public void title_of_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

	}

	//user clicks on login button
	@Then("^user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();	
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("argument[0].click()", loginBtn);
	}
	
	//User is on Products Page
	@And ("^user is on products page$")
	public void user_on_products_page() {
		String productsPage = driver.getTitle();
		System.out.println(productsPage);
		Assert.assertEquals("Products", productsPage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
