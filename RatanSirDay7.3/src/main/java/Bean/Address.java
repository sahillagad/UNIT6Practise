package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	 
	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int addID;
	  private String state;
	  private String city;
	  private String pincode;
	  
	  
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Address(int addID, String state, String city, String pincode) {
		super();
		this.addID = addID;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public int getAddID() {
		return addID;
	}
	public void setAddID(int addID) {
		this.addID = addID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addID=" + addID + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
