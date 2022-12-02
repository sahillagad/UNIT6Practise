package Bean;

public class Address {

	private String State;
	private String City;
	private String pincode;
	
	public Address(String state, String city, String pincode) {
		super();
		State = state;
		City = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [State=" + State + ", City=" + City + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
