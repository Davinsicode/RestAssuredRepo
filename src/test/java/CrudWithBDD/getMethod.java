package CrudWithBDD;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getMethod 
{
@Test
public void getData()
{
	Response res = when().get("http://rmgtestingserver:8084/projects/TY_PROJ_7363");
	
	System.out.println(res.contentType()); 
	
	res.then().log().all();
}
}
