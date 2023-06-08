package Serialization_DeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.SerializaionDeserializationArrayPOJO;

public class DeSerializingTheArrayObject 
{
@Test
public void readData() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper obj = new ObjectMapper();
	SerializaionDeserializationArrayPOJO ref = obj.readValue(new File("./SerializedAndDeSerializedFiels/arrayObj.json"), SerializaionDeserializationArrayPOJO.class);
	System.out.println(ref.getNumber()[0]);
	System.out.println(ref.getNumber()[1]);
}
}
