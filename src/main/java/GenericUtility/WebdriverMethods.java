package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverMethods 
{
public void maximizeTheBrowser(WebDriver driver)
{
	driver.manage().window().maximize();
}

public void waitForElementVisibility(WebDriver driver, WebElement ele)
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(ele));
}

public void selectDropdown(WebElement dropdown, int index)
{
	Select select = new Select(dropdown);
	select.selectByIndex(index);
}

public void selectDropdown(WebElement dropdown, String text)
{
	Select select = new Select(dropdown);
	try 
	{
		select.selectByValue(text);	
	} 
	catch (Exception e) 
	{
		select.selectByVisibleText(text);
	}
}
}
