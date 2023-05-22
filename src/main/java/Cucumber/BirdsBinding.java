package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BirdsBinding {
	public static WebDriver driver;
	public static String URL = "https://petstore.octoperf.com/";
	@Given("^Login and find the Birds button$")
    public void login_and_find_the_birds_button() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("j2ee");
		 driver.findElement(By.xpath("//input[@name='password']")).clear();
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("j2ee");
			driver.findElement(By.xpath("//input[@name='signon']")).click();
    }
	

    @When("^I clicked on Birds$")
    public void i_clicked_on_birds()  {
    	driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();
    }


    @When("^I clicked on AV-CB-one$")
    public void i_clicked_on_avcbone()  {
    	driver.findElement(By.xpath("//a[text()='AV-CB-01']")).click();
    }

    @When("^I clicked on EST-eighteen$")
    public void i_clicked_on_esteighteen()  {
    	driver.findElement(By.xpath("//a[text()='EST-18']")).click();
    }

    @When("^I clicked Add to cart$")
    public void i_clicked_add_to_cart() {
    	driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();
    }

    @Then("^I clicked on proceed to checkout$")
    public void i_clicked_on_proceed_to_checkout()  {
    	driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
    }

    @And("^I clicked on continue$")
    public void i_clicked_on_continue()  {
    	driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    @And("^I clicked on confirm$")
    public void i_clicked_on_confirm() {
    	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
    }

    @And("^I closed the Birds app$")
    public void i_closed_the_birds_app() {
    	driver.quit();
    }
}
