package CrudWithBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;
import io.restassured.http.ContentType;


public class updateMethod 
{
@Test
public void updateData()
{
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SureshKumar");
	obj.put("projectName", "ProjectAquila2");
	obj.put("status", "In Progress");
	obj.put("teamSize", 5);
	
	given().body(obj).contentType(ContentType.JSON)
	
	.when().put("http://rmgtestingserver:8084/projects/TY_PROJ_7358")
	
	.then().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(10000l),TimeUnit.MILLISECONDS)
	
	.log().all();
	
	
}
}
