package model;

import java.io.Serializable;
import java.util.Arrays;

public class Student extends Person implements Serializable{
	
	private double gpa;
	private String major;
	private String[] coursesTaken;
	private String[] coursesTaking;
	private String[] coursesToTake;
	private int nCredit;
	
	public Student(String fName, String lName, String phone, Address address, double gpa, String major,
			String[] coursesTaken, String[] coursesTaking, String[] coursesToTake, int nCredit) {
		super(fName, lName, phone, address);
		this.gpa = gpa;
		this.major = major;
		this.coursesTaken = coursesTaken;
		this.coursesTaking = coursesTaking;
		this.coursesToTake = coursesToTake;
		this.nCredit = nCredit;
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) throws GpaException {
		if(gpa >= 0 && gpa <=4){
			this.gpa = gpa;
		}
		else{
			throw new GpaException("GPA Must Be  In Between 0.0 to 4.0. ");
		}
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public String[] getCoursesTaking() {
		return coursesTaking;
	}

	public void setCoursesTaking(String[] coursesTaking) {
		this.coursesTaking = coursesTaking;
	}

	public String[] getCoursesToTake() {
		return coursesToTake;
	}

	public void setCoursesToTake(String[] coursesToTake) {
		this.coursesToTake = coursesToTake;
	}

	public int getnCredit() {
		return nCredit;
	}

	public void setnCredit(int nCredit) {
		this.nCredit = nCredit;
	}

	@Override
	public String toString() {
		return "Student "+ super.toString() + "\ngpa=" + gpa + ", major=" + major + ", coursesTaken="
				+ Arrays.toString(coursesTaken) + ", coursesTaking=" + Arrays.toString(coursesTaking)
				+ ", coursesToTake=" + Arrays.toString(coursesToTake) + ", Credit=" + nCredit;
	}



	

}
