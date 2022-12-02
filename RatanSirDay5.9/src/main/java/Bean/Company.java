package Bean;

public class Company {

	                  private String name;
	                  private String LicenceNo;
	                  private String city;
	                  private String state;
					public Company(String name, String licenceNo, String city, String state) {
						super();
						this.name = name;
						LicenceNo = licenceNo;
						this.city = city;
						this.state = state;
					}
					public Company() {
						super();
					}
					public String getName() {
						return name;
					}
					public void setName(String name) {
						this.name = name;
					}
					public String getLicenceNo() {
						return LicenceNo;
					}
					public void setLicenceNo(String licenceNo) {
						LicenceNo = licenceNo;
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
					@Override
					public String toString() {
						return "Company [name=" + name + ", LicenceNo=" + LicenceNo + ", city=" + city + ", state="
								+ state + "]";
					}
	                  
	                  
	                  
	    
	
	  
}
