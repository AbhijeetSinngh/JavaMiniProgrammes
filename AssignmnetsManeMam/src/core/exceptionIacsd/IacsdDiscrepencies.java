package exceptionIacsd;



import java.time.LocalDate;
import java.util.List;


import icore.Courses;
import icore.IacsdStudents;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class IacsdDiscrepencies {
//	A)Add validation rules
//	1 DOB : must be after 1st Jan 1985
//	2. Course must be valid
//	B)Create a Tester class
//	C)Accept Student details.
//	D)Invoke validation rules.
//	E)Override equals method
//	F)If all validations succeed, then create Student object and display it.(Use toString to
//	display it&#39;s details.)

	public static LocalDate parseAndValidateDob(String dob)throws CustomExceptionIacsd{
		LocalDate date=LocalDate.parse(dob);
		LocalDate validate=LocalDate.of(1985, 01, 01);
		if(date.isBefore(validate)) {
			throw new CustomExceptionIacsd("Dob not correct");
		}
			
		return date;
		
	} 
	public static Courses validateCourse(String course) throws IllegalArgumentException{
//		Courses courses=Courses.valueOf(course.toUpperCase());
//		if(course.equals(courses)) {
//			return courses;
//		}
//		throw new IllegalArgumentException("Course must be valid");
//         
		return Courses.valueOf(course.toUpperCase());
	}
	
	public static IacsdStudents validateIacsdStudents(String uid, String fname, String lname, String dob, String course, double fees,List<IacsdStudents> clist) throws CustomExceptionIacsd,IllegalArgumentException {
		LocalDate date=parseAndValidateDob(dob);
		Courses courses=validateCourse(course);
		//dupilcateUid(uid,clist);
		String s1=dup(uid,clist);
		return new IacsdStudents(s1, fname, lname, date, courses, fees) ;
	}
	
	public static String dup(String uid,List<IacsdStudents> clist) throws CustomExceptionIacsd {
		IacsdStudents student=new IacsdStudents(uid);
		if(clist.contains(student))
			throw new CustomExceptionIacsd("Uid  Duplication occured try diffrerent");
		return uid;
	}
	

	//Same Method with void return type as above	
	
	public static void dupilcateUid(String uid,List<IacsdStudents> list) throws CustomExceptionIacsd {
		IacsdStudents student=new IacsdStudents(uid);
		
		if(list.contains(student))
			throw new CustomExceptionIacsd("UID not correct");
			
	
	}
	

	public static IacsdStudents searchByUid(String uid,List<IacsdStudents> list) throws CustomExceptionIacsd {
		IacsdStudents student=new IacsdStudents(uid);
		if(list.contains(student)) {
			int index=list.indexOf(student);
			IacsdStudents student2=list.get(index);
			return student2;
			
			
		}
		
		throw  new CustomExceptionIacsd("Uid not matched");
		
		
	}
	public static void inputValues(List<IacsdStudents> list) {
		list.add(new IacsdStudents("A001", "SAbhijeet", "Singh", LocalDate.parse("1996-02-02"), Courses.DAC, 000));
		list.add(new IacsdStudents("A002", "Lokesh", "Singvi", LocalDate.parse("1997-03-02"), Courses.DBDA, 000));
		list.add(new IacsdStudents("C001", "Amit", "Ramteke", LocalDate.parse("1998-11-02"), Courses.DITIIS, 000));
		list.add(new IacsdStudents("B002", "harshal", "Boyar", LocalDate.parse("1999-10-06"), Courses.DAC, 000));
		list.add(new IacsdStudents("B003", "Aman", "Ji", LocalDate.parse("1996-05-07"), Courses.DBDA, 000));
		list.add(new IacsdStudents("C0023", "Vaibhav", "Jain", LocalDate.parse("1996-06-08"), Courses.DITIIS, 000));
	}
	}
