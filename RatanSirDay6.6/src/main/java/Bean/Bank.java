package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
 
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BankId;
	private String bankName;
	private String location;
	public Bank(int bankId, String bankName, String location) {
		super();
		BankId = bankId;
		this.bankName = bankName;
		this.location = location;
	}
	public Bank() {
		super();
	}
	public Bank(String bankName, String location) {
		super();
		this.bankName = bankName;
		this.location = location;
	}
	public int getBankId() {
		return BankId;
	}
	public void setBankId(int bankId) {
		BankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bank [BankId=" + BankId + ", bankName=" + bankName + ", location=" + location + "]";
	}
	
	
	
	
	 
	  
	
	 
}
