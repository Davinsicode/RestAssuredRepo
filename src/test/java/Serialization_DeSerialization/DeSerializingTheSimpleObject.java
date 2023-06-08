package Serialization_DeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;import Pojo.SerializtionDeserializationPOJO;

public class DeSerializingTheSimpleObject 
{
@Test
public void simpleObjDeserial() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper obj = new ObjectMapper();
	SerializtionDeserializationPOJO ref = obj.readValue(new File("./SerializedAndDeSerializedFiels/simpleObj.json"), SerializtionDeserializationPOJO.class);
	System.out.println(ref.getName());
	System.out.println(ref.getMobile());
}
}
