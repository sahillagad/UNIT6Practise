package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;

@Entity
public class College {

	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Student> students=new ArrayList<>();

	
	
	@PreRemove
	private void preRemove() {
	 
		for(Student student:students) {
			
			student.setCollege(null);
			
		}
		
		
	}
	
	
	public College(int collageId, String collageName, String collageAddress, List<Student> students) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.students = students;
	}

	public College(String collageName, String collageAddress, List<Student> students) {
		super();
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.students = students;
	}

	public College() {
		super();
	}

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "College [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", students=" + students + "]";
	}
}
