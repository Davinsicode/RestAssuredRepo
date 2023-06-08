package OptimizedTestScript;

import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.IConstantPath;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class CompleteEndToEnd extends BaseClass
{
	@Test
	public void endToEnd() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.userNameTextField().sendKeys(IConstantPath.appUserName);
		login.userPasswordTextField().sendKeys(IConstantPath.appPassword);
		login.loginSumbitButton().click();
		
		HomePage homePage = new HomePage(driver);
		webdriverMethods.waitForElementVisibility(driver, homePage.projectButton());
		homePage.projectButton().click();
		webdriverMethods.waitForElementVisibility(driver, homePage.addProjectButton());
		homePage.addProjectButton().click();
		webdriverMethods.waitForElementVisibility(driver, homePage.projectNameTextField());
		String projectName = "NewProject"+javaLib.randomNumber();
		homePage.projectNameTextField().sendKeys(projectName);
		homePage.projectManagerTextField().sendKeys("SureshKumar");
		webdriverMethods.selectDropdown(homePage.statusDropdown(), "Created");
		Thread.sleep(5000);
		//homePage.addProjectButton();
		
		System.out.println(projectName);
		
	}
}
