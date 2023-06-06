package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateMethod 
{
@Test
public void updateData()
{
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila");
	obj.put("status", "In Progress");
	obj.put("teamSize", 6);
	
	RequestSpecification preReq = RestAssured.given();
	preReq.body(obj);
	preReq.contentType(ContentType.JSON);
	
	Response res = preReq.put("http://rmgtestingserver:8084/projects/TY_PROJ_7358");
	
	System.out.println(res.prettyPeek());
}
}
