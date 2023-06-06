package Authentications;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class Basic_PreemptiveAuth 
{
@Test
public void preemptiveAuthentication()
{
	// Whenever the validation is enough for only once
	// In that case we will go for the Prremptive Ex: Flipkart
	
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	given().auth().preemptive().basic("rmgyantra", "rmgy@9999")
	
	.when().get("/login")
	
	.then().log().all();	
}
}
