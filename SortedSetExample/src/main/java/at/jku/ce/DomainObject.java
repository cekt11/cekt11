package at.jku.ce;

public class DomainObject {
 
	private String name;
	public String uuid = UUID.randomUUID().toString()
	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id){
		super();
		this.id=id;
	}
	 
	public String getUuid() {
		return id;
	}

}



