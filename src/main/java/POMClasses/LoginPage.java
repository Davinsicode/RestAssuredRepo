package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
@FindBy(id = "usernmae")
private WebElement userNameTextField;

@FindBy(id = "inputPassword")
private WebElement userPasswordTextField;

@FindBy(xpath = "//button[.='Sign in']")
private WebElement loginSumbitButton;

public WebElement userNameTextField()
{
	return userNameTextField;
}
public WebElement userPasswordTextField()
{
	return userPasswordTextField;
}
public WebElement loginSumbitButton()
{
	return loginSumbitButton;
}

public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

}
