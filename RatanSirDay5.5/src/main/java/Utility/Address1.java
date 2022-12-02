package Utility;

public class Address1 {
 
	
	private String city;
	private String state;
	private String pincode;
	public Address1(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address1() {
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
	

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	 
}