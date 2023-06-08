package Pojo;

public class SerializtionDeserializationPOJO 
{
	
// Declare the variables Globally
String name;
long mobile;

// Create the constructor to Initialize the values
public SerializtionDeserializationPOJO(String name, long mobile) {
	super();
	this.name = name;
	this.mobile = mobile;
}

// Create empty constructor to trigger the Serialization and Deserialization
public SerializtionDeserializationPOJO()
{
	
}

//Provide the getters and Setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
} 
}
