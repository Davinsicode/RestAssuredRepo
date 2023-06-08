package SchemaValidation;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Schema 
{
@Test
public void sample()
{
	File ref = new File("./SerializedAndDeSerializedFiels/schema.json");
	when().get("https://reqres.in/api/users?page=2").then()
	.assertThat().body(JsonSchemaValidator.matchesJsonSchema(ref));
	
	System.out.println("Validation Successfull");
}
}
