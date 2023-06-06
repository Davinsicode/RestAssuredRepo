package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter 
{
@Test
public void pathData()
{
	baseURI="http://rmgtestingserver";
	port = 8084;
	
	given().pathParam("projectId", "TY_PROJ_7392")
	
	.when().get("/projects/{projectId}")
	
	.then().log().all();
}
}
