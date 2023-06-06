package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class FormParameter 
{
	@Test
	public void formData()
	{
		// Without using any Objects we can post the data with the 
		// help of FormData
		baseURI="http://reqres.in";
		
		given().formParam("createdBy", "SureshKumar")
		.formParam("projectName", "Aquila")
		.formParam("status", "Created")
		.formParam("teamSize", "5")
		
		.when().post("/addProject")
		
		.then().log().all();
		
	}
}
