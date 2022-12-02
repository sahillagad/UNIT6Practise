package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
       
	         
	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private int customerId;
	     private String customerName;
	     private String address;
	    
	     
	     @OneToMany(cascade = CascadeType.ALL)
	     List<Product>  products=new ArrayList<>();


		public Customer(int customerId, String customerName, String address, List<Product> products) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.address = address;
			this.products = products;
		}


		public Customer(String customerName, String address, List<Product> products) {
			super();
			this.customerName = customerName;
			this.address = address;
			this.products = products;
		}


		public Customer() {
			super();
		}


		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public List<Product> getProducts() {
			return products;
		}


		public void setProducts(List<Product> products) {
			this.products = products;
		}


		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
					+ ", products=" + products + "]";
		}
	     
	     
	     
	
}
