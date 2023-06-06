package DifferentWaysToCreateObject;

import static io.restassured.RestAssured.*;
import java.io.File;
import org.testng.annotations.Test;

import Pojo.PojoClass;
import io.restassured.http.ContentType;

public class postDataThroughPojoClass 
{
	
		@Test
		public void postData()
		{
			
			PojoClass refObj = new PojoClass("SureshKumar", "Aquila44", "Created", 5);
			baseURI = "http://rmgtestingserver";
			port = 8084;
			
			given().body(refObj).contentType(ContentType.JSON)
			.when().post("addProject")
			.then().assertThat().statusCode(201).log().all();
		}
		

}
