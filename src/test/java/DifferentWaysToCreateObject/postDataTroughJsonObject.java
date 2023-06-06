package DifferentWaysToCreateObject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postDataTroughJsonObject 
{
@Test
public void postData()
{
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila11");
	obj.put("status", "Created");
	obj.put("teamSize", 5);
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().body(obj).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).log().all();
}
}
