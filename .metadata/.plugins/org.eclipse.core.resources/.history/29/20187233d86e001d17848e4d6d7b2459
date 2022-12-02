package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int poneId;
	private String serviceProviderName;
	private String locationServiceProvider;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	

	public Phone(int poneId, String serviceProviderName, String locationServiceProvider, User user) {
		super();
		this.poneId = poneId;
		this.serviceProviderName = serviceProviderName;
		this.locationServiceProvider = locationServiceProvider;
		this.user = user;
	}
	
	
	
	public Phone(String serviceProviderName, String locationServiceProvider, User user) {
		super();
		this.serviceProviderName = serviceProviderName;
		this.locationServiceProvider = locationServiceProvider;
		this.user = user;
	}



	public Phone() {
		super();
	}



	public int getPoneId() {
		return poneId;
	}
	public void setPoneId(int poneId) {
		this.poneId = poneId;
	}
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getLocationServiceProvider() {
		return locationServiceProvider;
	}
	public void setLocationServiceProvider(String locationServiceProvider) {
		this.locationServiceProvider = locationServiceProvider;
	}



	@Override
	public String toString() {
		return "Phone [poneId=" + poneId + ", serviceProviderName=" + serviceProviderName + ", locationServiceProvider="
				+ locationServiceProvider + ", user=" + user + "]";
	}

	

}
