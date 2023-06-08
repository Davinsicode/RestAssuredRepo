package Serialization_DeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.SerializtionDeserializationPOJO;

public class SerializingTheSimpleObject 
{
	@Test
	public void simpleObject() throws JsonGenerationException, JsonMappingException, IOException
	{
		SerializtionDeserializationPOJO ref = new SerializtionDeserializationPOJO("Suresh",8098486523l);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SerializedAndDeSerializedFiels/simpleObj.json"),ref);		
	}
}
