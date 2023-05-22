package Cucumber;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bindings {

	public static WebDriver driver;
	public static String URL = "https://petstore.octoperf.com/";
	@Given("I launched the application")
	public void i_launched_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	@When("I clicked on enter the store")
	public void i_clicked_on_enter_the_store() {
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		
	}
	@When("I clicked on signIn button")
	public void i_clicked_on_sign_in_button() {
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}
	@Then("I enter the username {string}")
	public void i_enter_the_username(String string)
	 {
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
		
	} 
	@Then("I enter the password  {string}")
	public void i_enter_the_password(String string)
	 {
    driver.findElement(By.xpath("//input[@name='password']")).clear();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
		
	} 
	@Then("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}

	@Then("I verified Login successfully")
	public void i_verified_login_successfully() {
		String welcome_content =driver.findElement(By.xpath("//a[text()='Sign Out']")).getText();

		String Expected_welcome_content = "Sign Out";
		assertEquals(welcome_content, Expected_welcome_content);
		System.out.println("Login successfully");
	}
}

   