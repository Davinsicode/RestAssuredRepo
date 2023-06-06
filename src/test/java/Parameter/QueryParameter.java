package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

public class QueryParameter 
{
@Test
public void pathData()
	{
		baseURI="http://reqres";
		
		given().queryParam("page", "2")
		
		.when().get("/projects")
		
		.then().log().all();
	}

}
