package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postMethod 
{
@Test
public void postData()
{
	// Step:1 ---> Create the Pre-Request 
	// Simple Object Creation
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila");
	obj.put("status", "Created");
	obj.put("teamSize", 5);
	
	RequestSpecification preReq = RestAssured.given();
	preReq.body(obj); // Form Data
	preReq.contentType(ContentType.JSON); // Content Type
	
	// Step:2 ---> Actions
	Response res = preReq.post("http://rmgtestingserver:8084/addProject");
	
	// Step:3 ---> Validation
	System.out.println(res.prettyPeek());
}
}
