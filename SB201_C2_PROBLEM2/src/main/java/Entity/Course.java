package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {

	 @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY )
        private int courseId;
	   private String courseName;
	   private int duration;
	   private double fee;
	   
	   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	   List<Student> students=new ArrayList<>();

	public Course(int courseId, String courseName, int duration, double fee, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.students = students;
	}

	public Course() {
		super();
	}

	public Course(String courseName, int duration, double fee, List<Student> students) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.students = students;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", students=" + students + "]";
	}
	 
	   
	   
}
