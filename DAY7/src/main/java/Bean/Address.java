package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	private String state;
	private String pincode;
	private String lable;
	
	
	
	

	public Address(int addId, String city, String state, String pincode, String lable) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.lable = lable;
	}
	public Address(String city, String state, String pincode, String lable) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.lable = lable;
	}
	
	
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", lable=" + lable + "]";
	}

	
	
}
