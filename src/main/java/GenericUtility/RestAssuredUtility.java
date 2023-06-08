package GenericUtility;

import org.testng.annotations.Test;
import io.restassured.response.Response;

public class RestAssuredUtility 
{
	@Test
	public String getJsonData(Response responce, String key)
	{
		String jsonData = responce.jsonPath().get(key);
		return jsonData;
	}
}
