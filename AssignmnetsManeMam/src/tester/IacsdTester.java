package tester;
//Sample data a1 abhi singh 2002-02-02 dbda 78
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static exceptionIacsd.IacsdDiscrepencies.searchByUid;
import static exceptionIacsd.IacsdDiscrepencies.inputValues;

import exceptionIacsd.CustomExceptionIacsd;

import static exceptionIacsd.IacsdDiscrepencies.validateIacsdStudents;

import icore.IacsdStudents;

public class IacsdTester {

	public static void main(String[] args) throws IllegalArgumentException, CustomExceptionIacsd {
		ArrayList<IacsdStudents> list=new ArrayList<>();
		inputValues(list);
		boolean exit=false;
		
		try(Scanner sc=new Scanner(System.in)){
			while(!exit) {
				System.out.println("select 1:add Students 2:Show List 3:Search via 4:"
						+ "Sort Uid 0 Exit");
		switch(sc.nextInt()) {
		case 1:
				System.out.println("Please Enter  uid,  fname,  lname,  dob,  course,  fees");
		IacsdStudents s1=validateIacsdStudents(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),list);
		list.add(s1);
		break;
		case 2:
                for(IacsdStudents s:list) {
	System.out.println(s); 
                }
        break;
		case 3:System.out.println("Enter Uid");
		 IacsdStudents student=searchByUid(sc.next(),list);
		 System.out.println(student);
		       
			break;
		case 4: System.out.println("Sorting via uid"); 
		//System.out.println("Enter uid");
		   Collections.sort(list);
		   for(IacsdStudents clist: list) {
			   System.out.println(clist);
		   }
			break;
		case 5:
			break;
			
		case 0:
			exit=false;
			break;
			
		}
		}
	}catch(Exception e){
		System.out.println(e.getMessage());
//		e.printStackTrace();
		
	}
	}
}
