package Cucumber;

import org.openqa.selenium.WebElement;

public class PageActions {
	//click
		public static void ClickOnElement(WebElement ele)
		{
			ele.click();
		}
		//sendKeys
		public static void EnterText(WebElement ele, String text)
		{
			ele.sendKeys(text);
		}
}
