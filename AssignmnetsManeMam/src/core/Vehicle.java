package core;

public abstract class Vehicle {
//	1) Write a java program in which you will declare an abstract class Vehicle.
//	Inherits this class from two classes Car and Truck using the method engine( ) in both .
//	And display “car has good engine” and “truck has bad engine” massage.
//
	private String name;
	private String company;
	private int category;
	
//	public Vehicle() {
//		name="Vehicle";
//		company="Vehile";
//		category=0;
//		
//	}
	//public Vehicle(String name,String company,int category) {
//		this.name=name;
//		this.category=category;
//		this.company=company;
	//}
	abstract public  void engine();
	
	}
