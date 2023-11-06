package icore;

import java.time.LocalDate;
import java.util.Comparator;


public class IacsdStudents implements Comparable<IacsdStudents> {
	/*
	 * 4) Student Management system , which will keep track of student added in the
	 * IACSD Objective : Accept student details as follows PRN(string) : Unique ID,
	 * FirstName(string), LastName(string), DOB(LocalDate), Course(enum)
	 * {PGDAC(95000),DBDA(90000),DITTIS(85000) }, fees(double) , Boolean
	 * confirm_admission
	 */

	String uid;
	String fname;
	String lname;
	LocalDate dob;
	Courses course;
	double fees;
	boolean confirmAdmission = false;

//	public IacsddStudents(String uid,String fname,String lname,LocalDate dob,Courses fees ) {
//		super();
//		this.confirmAdmission=true;
//		this.
//		
//		
//	}
	public IacsdStudents(String uid, String fname, String lname, LocalDate dob, Courses course, double fees) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.course = course;
		this.fees = fees;
		this.confirmAdmission = true;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

//	public double getFees() {
//		return fees;
//	}

	public void setFees(double fees) {
		this.fees = fees;
	}

//	public String toString() {
//		return "IACSD STUDENTS{"+"Namee:"+fname+"";
//	}
	@Override
	public String toString() {
		return "IacsdStudents [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", course="
				+ course + ", fees=" + (fees +course.getFees()) + ", confirmAdmission=" + confirmAdmission + "]";
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof IacsdStudents) {
			IacsdStudents student = (IacsdStudents) o;

			return this.uid.equals(student.uid);
		}
		return false;
		
	}
	
	public IacsdStudents(String uid) {
		super();
		this.uid = uid;
	}

//	@Override
//	public int compare(IacsdStudents o1, IacsdStudents o2) {
//		o1.uid.compareTo(o2.uid);
//		return 0;
//	}
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return this.email.compareTo(o.email);
//	}
	@Override
	public int compareTo(IacsdStudents o) {
		return this.uid.compareTo(o.uid);
	
	}

}
