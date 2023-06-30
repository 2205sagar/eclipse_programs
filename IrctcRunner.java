package com.xworkz.constructor;

public class IrctcRunner {
	public static void maain(String args[]) {
		Irctc irctc=new 
		System.out.println("Name is:"+irctc.name);
		System.out.println("price is:"+irctc.price);
		System.out.println("location is:"+irctc.location);
		System.out.println("seat number is:"+irctc.seatNumber);
		//Printing values using constructor
		Irctc irctc1= new Irctc("Aishwarya",480,"Bellary","F23");
		System.out.println("Name is:"+irctc1.name);
		System.out.println("price is:"+irctc1.price);
		System.out.println("location is:"+irctc1.location);
		System.out.println("seat number is:"+irctc1.seatNumber);
		
		//Assigning values and printing values by using reference
		Irctc irctc2= new Irctc();
		irctc2.name="Sagar";
		irctc2.price=580;
		irctc2.location="Dharwad";
		irctc2.seatNumber="C12";
		
		System.out.println("Name is:"+irctc2.name);
		System.out.println("price is:"+irctc2.price);
		System.out.println("location is:"+irctc2.location);
		System.out.println("seat number is:"+irctc2.seatNumber);
		
		Irctc irctc3=new Irctc();
		irctc3.setName("Ravi");
		System.out.println("Name is:"+irctc3.name);
		
	}


	
	
}
