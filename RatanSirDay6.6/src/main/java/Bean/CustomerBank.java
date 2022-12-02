package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CustomerBank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int customerAccId;
	private String customerName;
	private String customerAdd;
	private double balance;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Bank bank;
	
	
	

	public CustomerBank(int customerAccId, String customerName, String customerAdd, double balance, Bank bank) {
		super();
		this.customerAccId = customerAccId;
		this.customerName = customerName;
		this.customerAdd = customerAdd;
		this.balance = balance;
		this.bank = bank;
	}
	
	
	
	public CustomerBank(String customerName, String customerAdd, double balance, Bank bank) {
		super();
		this.customerName = customerName;
		this.customerAdd = customerAdd;
		this.balance = balance;
		this.bank = bank;
	}



	public CustomerBank() {
		super();
	}
	public int getCustomerAccId() {
		return customerAccId;
	}
	public void setCustomerAccId(int customerAccId) {
		this.customerAccId = customerAccId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAdd() {
		return customerAdd;
	}
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	public Bank getBank() {
		return bank;
	}



	public void setBank(Bank bank) {
		this.bank = bank;
	}



	@Override
	public String toString() {
		return "CustomerBank [customerAccId=" + customerAccId + ", customerName=" + customerName + ", customerAdd="
				+ customerAdd + ", balance=" + balance + ", bank=" + bank + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
