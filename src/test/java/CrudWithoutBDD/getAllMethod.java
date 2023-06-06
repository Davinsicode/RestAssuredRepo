package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getAllMethod 
{
@Test
public void getAllData()
{
RequestSpecification preReq = RestAssured.given();
Response res = preReq.get("http://rmgtestingserver:8084/projects");
System.out.println(res.prettyPeek());
}
}
