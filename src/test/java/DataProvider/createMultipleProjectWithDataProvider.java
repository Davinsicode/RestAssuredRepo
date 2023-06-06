package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pojo.PojoClass;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.Random;

public class createMultipleProjectWithDataProvider 
{

@Test(dataProvider = "formDatas" )
public void createProjects(String createdBy, String projectName, String status, int teamSize)
{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	
	Random ran = new Random();
	int ranNum = ran.nextInt(500);
	
	PojoClass obj = new PojoClass(createdBy, projectName+ranNum, status, teamSize);
	
	given().body(obj).contentType(ContentType.JSON)
	.when().post("addProject")
	.then()
	.log().body();
}

@DataProvider()
public Object[][] formDatas()
{
	Object[][] obj = new Object[3][4];
	
	obj[0][0] = "Suresh";
	obj[0][1] = "ProjectNew";
	obj[0][2] = "Created";
	obj[0][3] = 5;
	
	obj[1][0] = "Kumar";
	obj[1][1] = "ProjectNew";
	obj[1][2] = "Created";
	obj[1][3] = 5;
	
	obj[2][0] = "Roshan";
	obj[2][1] = "ProjectNew";
	obj[2][2] = "Created";
	obj[2][3] = 5;
	
	return obj;
}
}
