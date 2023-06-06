package CrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class postMethod 
{
@Test
public void postData()
{
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila1");
	obj.put("status", "Created");
	obj.put("teamSize", 5);
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().body(obj).contentType(ContentType.JSON)
	
	.when().post("/addProject")
	
	.then().statusCode(201).contentType(ContentType.JSON).log().all();
	
	
}
}
