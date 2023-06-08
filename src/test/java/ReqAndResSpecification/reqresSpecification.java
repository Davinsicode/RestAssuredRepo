package ReqAndResSpecification;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class reqresSpecification 
{
@Test
public void reqres()
{
	
	RequestSpecification reqSpec = new RequestSpecBuilder()
	.setBaseUri("http://rmgtestingserver:8084").setContentType(ContentType.JSON).build();
	
	ResponseSpecification resSpec = new ResponseSpecBuilder()
	.expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	given().spec(reqSpec)
	.when().get("/projects/TY_PROJ_7363")
	.then().spec(resSpec).log().all();
}
}
