package Bean;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Id;
@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
public class Animal {

	
	@Id
	private int Id;
	private String type;
	public Animal(int id, String type) {
		super();
		Id = id;
		this.type = type;
	}
	public Animal() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [Id=" + Id + ", type=" + type + "]";
	}
	

	
	
}
