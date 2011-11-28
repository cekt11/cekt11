package at.jku.ce;

public class DomainObject {

	public String id; 
	private String name;
	private String id = UUID.randomUUID().toString()
	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id){
		super();
		this.id=id;
	}
	 
	public String getId() {
		return id;
	}

}

 

