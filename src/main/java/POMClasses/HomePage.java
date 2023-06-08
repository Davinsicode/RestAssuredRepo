package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(xpath = "//a[.='Projects']")
private WebElement projectButton;

@FindBy(xpath = "//span[.='Create Project']")
private WebElement createProjectLink;

@FindBy(name = "projectName")
private WebElement projectNameTextField;

@FindBy(name = "createdBy")
private WebElement projectManagerTextField;

@FindBy(name = "status")
private WebElement statusDropdown;

@FindBy(xpath = "//input[@type='submit']")
private WebElement addProjectButton;

@FindBy(xpath = "//input[@type='button'][@value='Cancel'])[3]")
private WebElement projectCancelButton;

public WebElement projectButton()
{
	return projectButton;
}

public WebElement createProjectLink()
{
return createProjectLink;	
}

public WebElement projectNameTextField()
{
return projectNameTextField;	
}

public WebElement projectManagerTextField()
{
return projectManagerTextField;	
}

public WebElement statusDropdown()
{
return statusDropdown;	
}

public WebElement addProjectButton()
{
return addProjectButton;	
}

public WebElement projectCancelButton()
{
return projectCancelButton;	
}

public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

}
