package Bean;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal{

	
	private String name;

	public Pet(int id, String type, String name) {
		super(id, type);
		this.name = name;
	}
	
	
	
	public Pet(int id, String type) {
		super(id, type);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
	
	 
}
