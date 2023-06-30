package com.xworkz.constructor.runner;

import com.xworkz.constructor.RedBus;

public class RedBusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RedBus travels1= new RedBus();
	
	//RedBus travels1=new RedBus("VRL","Priya",18,24,"Dharwad","Bangalore",22.30f,6.30f,"Anand","Shankar");
	System.out.println(travels1.age);
	System.out.println(travels1.travelsName);
	System.out.println(travels1.passengerName);
	System.out.println(travels1.noOfPassengers);
	System.out.println(travels1.from);
	System.out.println(travels1.to);
	System.out.println(travels1.departure);
	System.out.println(travels1.arrival);
	System.out.println(travels1.driver);
	System.out.println(travels1.conductor);
	}

	
}
