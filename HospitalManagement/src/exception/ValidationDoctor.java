package exception;

import java.time.LocalDate;

import core.Doctor;
import core.TreatmentsAvailable;

public class ValidationDoctor {
//	public Doctor(String docId, String dname, String email, String degree, LocalDate joinDate, 
	// double salary, int exp,
//			TreatmentsAvailable perfDoc)
	public static Doctor validateAllDetails(String docId,String dname,String email,String degree,
			String joinDate,double Salary ,int exp) throws CustomExceptionDoc {
		LocalDate date=validatejoinDate(joinDate);
		
		
		
		
		
		
		return null;
		
		
		
	}

public static LocalDate validatejoinDate(String joinDate) throws CustomExceptionDoc {
	LocalDate dates=LocalDate.parse(joinDate);
	LocalDate check=LocalDate.of(2011, 01, 01);
	if(dates.isAfter(check)) {
		return dates;
		
	}
	throw new CustomExceptionDoc("Join Date not eligible");
}
	
	
	

}
