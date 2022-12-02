package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Product.getAllProduct",query = "select p from Product p")
@NamedQuery(name = "Product.getProductByName",query = "select p from Product p where p.pname=?1")
@NamedQuery(name="Product.getProductLessThan" ,query = "select p from Product p where p.mrp<?1")
@NamedQuery(name = "Product.getProductGreaterThan",query = "select p from Product p where p.mrp>?1")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private double mrp;
	public Product(int pid, String pname, double mrp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mrp = mrp;
	}
	public Product(String pname, double mrp) {
		super();
		this.pname = pname;
		this.mrp = mrp;
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
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", mrp=" + mrp + "]";
	}

	
	
	
}
