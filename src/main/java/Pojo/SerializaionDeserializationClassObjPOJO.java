package Pojo;

public class SerializaionDeserializationClassObjPOJO 
{
	String name;
	Object ref;
	
	public SerializaionDeserializationClassObjPOJO(String name, Object ref) {
		super();
		this.name = name;
		this.ref = ref;
	}

	public SerializaionDeserializationClassObjPOJO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getRef() {
		return ref;
	}

	public void setRef(Object ref) {
		this.ref = ref;
	}
	
}
