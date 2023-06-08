package OptimizedTestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.sql.SQLException;
import GenericUtility.BaseClass;
import GenericUtility.EndPoints;
import Pojo.PojoClass;
import io.restassured.response.Response;

public class CreateData extends BaseClass 
{
	// Create Data and Validate the Data present in database 
	
	@Test(dataProvider = "datas")
	public void postAndValidateData(String createdBy, String projectName, String status, int teamSize) throws SQLException
	{
		PojoClass obj = new PojoClass(createdBy, projectName, status, teamSize);
		Response res = given().spec(reqSpec).body(obj)
		.when().post(EndPoints.addProject);
		
		String expectedData = restLib.getJsonData(res, "projectId");
		System.out.println(expectedData);
		
		String query = "select * from project";
		String actualData = dLib.readDataFromDatabase(query, 1, expectedData);
		
		Assert.assertEquals(expectedData, actualData);
		System.out.println("Test Case Pass");
		
		res.then().log().all();
	}
	@DataProvider
	public Object[][] datas()
	{
		Object obj[][] = new Object[1][4];
		obj[0][0] = "SureshKumar"+javaLib.randomNumber()+"";
		obj[0][1] = "NewBlizzProject";
		obj[0][2] = "Created";
		obj[0][3] = 5;
		return obj;
	}
}
