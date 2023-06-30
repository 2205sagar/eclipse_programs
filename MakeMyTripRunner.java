package com.xworkz.constructor.runner;

import com.xworkz.constructor.MakeMyTrip;

public class MakeMyTripRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeMyTrip makeMyTrip= new MakeMyTrip();
		makeMyTrip.book();
		makeMyTrip.pay();
		makeMyTrip.travel();
		makeMyTrip.reach();
		
		MakeMyTrip makeMyTrip2= new MakeMyTrip();
		makeMyTrip2.setTravelsName("VRL");
		String travelsName=makeMyTrip2.getTravelsName();
		System.out.println(travelsName);
		
		makeMyTrip2.setPassengerName("Sunil");
		String passengerName=makeMyTrip2.getPassengerName();
		System.out.println(passengerName);
		
		makeMyTrip2.setAge(35);
		int age=makeMyTrip2.getAge();
		System.out.println(age);
		
		makeMyTrip2.setNoOfPassengers(30);
		int noOfPassengers=makeMyTrip2.getNoOfPassengers();
		System.out.println(noOfPassengers);
		
		makeMyTrip2.setFrom("DWD");
		String from=makeMyTrip2.getFrom();
		System.out.println(from);
		
		makeMyTrip2.setTo("mysore");
		String to=makeMyTrip2.getTo();
		System.out.println(to);
		
		makeMyTrip2.setDeparture(23.15f);
		float departure=makeMyTrip2.getDeparture();
		System.out.println(departure);
		
		makeMyTrip2.setArrival(5.45f);
		float arrival=makeMyTrip2.getArrival();
		System.out.println(arrival);
		
		makeMyTrip2.setDriver("Kiran");
		String driver=makeMyTrip2.getDriver();
		System.out.println(driver);
		
		
		makeMyTrip2.setConductor("Swamy");
		String conductor=makeMyTrip2.getConductor();
		System.out.println(conductor);
	}

}
