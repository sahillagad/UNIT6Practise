package Bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int accountId;
	private String email;
	private String Address;
	private double balance;
	private LocalDate createDate;
	public Account(int accountId, String email, String address, double balance, LocalDate createDate) {
		super();
		this.accountId = accountId;
		this.email = email;
		Address = address;
		this.balance = balance;
		this.createDate = createDate;
	}
	public Account(String email, String address, double balance, LocalDate createDate) {
		super();
		this.email = email;
		Address = address;
		this.balance = balance;
		this.createDate = createDate;
	}
	public Account() {
		super();
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", Address=" + Address + ", balance=" + balance
				+ ", createDate=" + createDate + "]";
	}
	
	
	
	
	
	
	
	
}
