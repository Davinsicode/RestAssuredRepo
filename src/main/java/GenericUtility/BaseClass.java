package GenericUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class BaseClass
{
	public WebDriver driver;
	public DatabaseLibrary dLib = new DatabaseLibrary();
	public RestAssuredUtility restLib = new RestAssuredUtility(); 
	public JavaLibrary javaLib = new JavaLibrary();
	public WebdriverMethods webdriverMethods = new WebdriverMethods();
	
	public RequestSpecification reqSpec;
	public ResponseSpecification resSpec;
	@BeforeSuite(enabled = false)
	public void basicConfig() throws SQLException
	{
		dLib.getConnectionFromDataBase();
		
		// Pre-Conditions
		reqSpec = new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084").setContentType(ContentType.JSON).build();
		resSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
	
	@BeforeClass
	public void openApplication()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		webdriverMethods.maximizeTheBrowser(driver);
		driver.get(IConstantPath.appUrl);
	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.close();
	}
	
	@AfterSuite(enabled = false)
	public void disconnectDatabase() throws SQLException
	{
		dLib.dissconectFromDatabase();
	}
}
