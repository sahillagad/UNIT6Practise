package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

	
	 @Id
	 @GeneratedValue
	 private int phoneid;
	 private String phoneType;
	 private String phoneNo;
	 
	 private int userid;

	public Phone(int phoneid, String phoneType, String phoneNo, int userid) {
		super();
		this.phoneid = phoneid;
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
		this.userid = userid;
	}

	public Phone() {
		super();
	}

	public Phone(String phoneType, String phoneNo, int userid) {
		super();
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
		this.userid = userid;
	}

	public int getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Phone [phoneid=" + phoneid + ", phoneType=" + phoneType + ", phoneNo=" + phoneNo + ", userid=" + userid
				+ "]";
	}
	 
	 
	 
	
}
