package RequestChaining;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class PostAndGetTheData 
{
@Test
public void reqChaining()
{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	HashMap<Object, Object> obj = new HashMap<>();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "AquilaProject4");
	obj.put("status", "Created");
	obj.put("teamSize", 5);
	
	Response res = given().body(obj).contentType(ContentType.JSON)
	.when().post("/addProject");
	
	String pid = (String)res.jsonPath().get("projectId");
	System.out.println(pid);
	
	res.then().assertThat().statusCode(201).log().all();
	
	Response res2 = given().pathParam("pid1", pid)
	.when().get("/projects/{pid1}");
	
	res2.then().log().all();
}
}
