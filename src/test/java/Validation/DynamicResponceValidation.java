package Validation;

import static io.restassured.RestAssured.*;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class DynamicResponceValidation 
{
	@Test
	public void getAllData()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		String expectedData = "TY_PROJ_7248";
		
		Response res = when().get("/projects");
		List<String> lists = res.jsonPath().get("projectId");
		
		Boolean flag = false;
		for (String proId : lists) 
		{
			if(expectedData.equalsIgnoreCase(proId))
			{
				flag = true;
			}
		}
		Assert.assertTrue(flag);
		
		System.out.println("Validated Successfully");
	}
}
