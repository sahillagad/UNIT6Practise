package Bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      private int pid;
	     private String pname;
	     private String category;
	     private Double  price;
	     
	     /*
	      *      private String name;
	                  private String LicenceNo;
	                  private String city;
	                  private String state;
	      * 
	      */
	     
	     @Embedded
	     @AttributeOverrides({
	    	 @AttributeOverride(name = "name",column = @Column(name="Company1name")),
	    	 @AttributeOverride(name = "LicenceNo",column = @Column(name="Company1LicenceNo")),
	    	 @AttributeOverride(name = "city",column = @Column(name="Comapany1city")),
	    	 @AttributeOverride(name = "state",column = @Column(name="Company1state") )
	     })
	     private   Company company1;
	     
	     @Embedded
	     @AttributeOverrides({
	    	 @AttributeOverride(name = "name",column = @Column(name="Company2name")),
	    	 @AttributeOverride(name = "LicenceNo",column = @Column(name="Company2LicenceNo")),
	    	 @AttributeOverride(name = "city",column = @Column(name="Comapany2city")),
	    	 @AttributeOverride(name = "state",column = @Column(name="Company2state") )
	     })
	     private Company company2;

		public Product(int pid, String pname, String category, Double price, Company company1, Company company2) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.category = category;
			this.price = price;
			this.company1 = company1;
			this.company2 = company2;
		}

		public Product(String pname, String category, Double price, Company company1, Company company2) {
			super();
			this.pname = pname;
			this.category = category;
			this.price = price;
			this.company1 = company1;
			this.company2 = company2;
		}

		public Product() {
			super();
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Company getCompany1() {
			return company1;
		}

		public void setCompany1(Company company1) {
			this.company1 = company1;
		}

		public Company getCompany2() {
			return company2;
		}

		public void setCompany2(Company company2) {
			this.company2 = company2;
		}

		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", category=" + category + ", price=" + price
					+ ", company1=" + company1 + ", company2=" + company2 + "]";
		}
	     
	    
}
