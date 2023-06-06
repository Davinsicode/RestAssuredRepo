package DifferentWaysToCreateObject;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postDataThroughJsonFile 
{
@Test
public void postData()
{
	File file = new File("./src/test/resources/formData.json");
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().body(file).contentType(ContentType.JSON)
	.when().post("addProject")
	.then().assertThat().statusCode(201).log().all();
}
}
