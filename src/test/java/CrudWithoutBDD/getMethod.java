package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getMethod 
{
@Test
public void getData()
{
RequestSpecification preReq = RestAssured.given();	

Response res = preReq.get("http://rmgtestingserver:8084/projects/TY_PROJ_7358");

System.out.println(res.prettyPeek());
}
}
