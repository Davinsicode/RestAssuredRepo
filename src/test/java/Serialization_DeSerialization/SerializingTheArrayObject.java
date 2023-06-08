package Serialization_DeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.SerializaionDeserializationArrayPOJO;

public class SerializingTheArrayObject 
{
	@Test
	public void sample() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] arr = {12345,67890};
		SerializaionDeserializationArrayPOJO ref = new SerializaionDeserializationArrayPOJO(arr);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SerializedAndDeSerializedFiels/arrayObj.json"), ref);
		
		System.out.println("Values Serialized Successfully");
	}
}
