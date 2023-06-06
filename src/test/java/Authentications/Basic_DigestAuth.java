package Authentications;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class Basic_DigestAuth 
{
@Test
public void digestAuthentication()
{
	// Whenever the validation is needed for every time
	// In that case we will go for the Prremptive Ex: Netflix
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().auth().digest("rmgyantra", "rmgy@9999")
	
	.when().get("/login")
	
	.then().log().all();	
}
}
