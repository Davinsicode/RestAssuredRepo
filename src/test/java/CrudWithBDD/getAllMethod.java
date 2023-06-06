package CrudWithBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;


public class getAllMethod 
{
@Test
public void getAllData()
{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	when().get("/projects").then().time(Matchers.lessThan(10000l),TimeUnit.MILLISECONDS).log().all();
}
}
