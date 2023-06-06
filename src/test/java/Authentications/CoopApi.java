package Authentications;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class CoopApi 
{
@Test
public void generateToken()
{
	Response res = given().formParam("client_id", "ProjectBlizz")
	.formParam("client_secret", "808e3ebe6ce6942de2085141e42aede4")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://projectblizz.com")
	.formParam("code ", "authorization_code")
	.when().post("http://coop.apps.symfonycasts.com/token");
	
	String token = res.jsonPath().get("access_token");
	//System.out.println(token);
	
	given().auth().oauth2(token).pathParam("USER_ID", 4544)
	.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
	.then().log().all();
}
}
