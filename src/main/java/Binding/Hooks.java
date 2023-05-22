package Binding;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
public static WebDriver driver;
public static String URL = "https://www.nykaa.com";
@Before
public void start()
{
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	//driver.get(URL);
	System.out.println("Frome Hooks Start");
}
@After
public static void End()
{
	//driver.quit();
	System.out.println("Frome Hooks End");
}
}
