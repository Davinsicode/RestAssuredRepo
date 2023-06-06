package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponceValidation 
{
@Test
public void getAllData()
{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	String expectedData = "TY_PROJ_6248";
	
	Response res = when().get("/projects");
	String actualData = res.jsonPath().get("[0].projectId");
	
	Assert.assertEquals(expectedData,actualData);
	System.out.println("Data Verified Successully");
	
	res.then().log().all();
}
}
