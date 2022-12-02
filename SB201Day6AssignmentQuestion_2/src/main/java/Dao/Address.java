package Dao;

public class Address {
 
	 private String state;
	 private String City;
	 private String Pincode;
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		City = city;
		Pincode = pincode;
	}
	public Address() {
		super();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", City=" + City + ", Pincode=" + Pincode + "]";
	}
	 
	 
	 
	             
	
}
