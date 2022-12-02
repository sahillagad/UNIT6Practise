package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int phoneId;
	 private String serviceProvier;
	 private String phoneNumber;
	public Phone(int phoneId, String serviceProvier, String phoneNumber) {
		super();
		this.phoneId = phoneId;
		this.serviceProvier = serviceProvier;
		this.phoneNumber = phoneNumber;
	}
	public Phone() {
		super();
	}
	public Phone(String serviceProvier, String phoneNumber) {
		super();
		this.serviceProvier = serviceProvier;
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getServiceProvier() {
		return serviceProvier;
	}
	public void setServiceProvier(String serviceProvier) {
		this.serviceProvier = serviceProvier;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", serviceProvier=" + serviceProvier + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
