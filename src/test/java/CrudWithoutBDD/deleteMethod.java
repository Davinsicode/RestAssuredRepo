package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteMethod 
{
@Test
public void deleteData()
{
RequestSpecification preReq = RestAssured.given();	
Response res = preReq.delete("http://rmgtestingserver:8084/projects/TY_PROJ_7359");
System.out.println(res.prettyPeek());
}
}
