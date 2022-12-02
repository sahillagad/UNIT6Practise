package Entity;

import javax.persistence.Entity;

@Entity
public class FullTimeInstructor extends Instructor{
 
 private double	 salary;
 private String	email;
public FullTimeInstructor(int instructorId, String instructorName, double salary, String email) {
	super(instructorId, instructorName);
	this.salary = salary;
	this.email = email;
}
public FullTimeInstructor(int instructorId, String instructorName) {
	super(instructorId, instructorName);
}



public FullTimeInstructor() {
	super();
}
public FullTimeInstructor(String instructorName, double salary, String email) {
	super(instructorName);
	this.salary = salary;
	this.email = email;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "FullTimeInstructor [salary=" + salary + ", email=" + email + "]";
}
	 
 
 
}
