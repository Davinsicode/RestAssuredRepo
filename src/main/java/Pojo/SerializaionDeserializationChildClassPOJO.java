package Pojo;

public class SerializaionDeserializationChildClassPOJO 
{
	String name;
	long mobile[];
	
	public SerializaionDeserializationChildClassPOJO(String name, long[] mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	
	public SerializaionDeserializationChildClassPOJO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long[] getMobile() {
		return mobile;
	}

	public void setMobile(long[] mobile) {
		this.mobile = mobile;
	}
	
	
}
