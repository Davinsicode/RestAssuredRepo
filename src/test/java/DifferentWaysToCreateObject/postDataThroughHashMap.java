package DifferentWaysToCreateObject;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postDataThroughHashMap 
{
@Test
public void postData()
{
	HashMap obj = new HashMap<>();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila22");
	obj.put("status", "Created");
	obj.put("teamSize", 5);
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().body(obj).contentType(ContentType.JSON)
	.when().post("addProject")
	.then().assertThat().statusCode(201).log().all();
}
}
