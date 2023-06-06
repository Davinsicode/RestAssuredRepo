package CrudWithBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;


public class deleteMethod 
{
@Test
public void deleteData()
{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	when().delete("/projects/TY_PROJ_7371")
	.then().statusCode(204).time(Matchers.lessThan(10000l),TimeUnit.MILLISECONDS).log().all();

}
}
