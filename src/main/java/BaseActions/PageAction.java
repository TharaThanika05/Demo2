package BaseActions;

import org.openqa.selenium.WebElement;

import Binding.Hooks;

public class PageAction {
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
