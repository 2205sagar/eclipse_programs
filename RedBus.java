package com.xworkz.constructor;

public class RedBus {
	//literal way of assigning values
	public String travelsName="Ganesh";
	public String passengerName="Suresh";
	public int age=45;
	public int noOfPassengers=28;
	public String from="DWD";
	public String to="Mysore";
	public float departure=23.10f;
	public float arrival=7.30f;
	public String driver="xyz";
	public String conductor="abc";
	//NO argument constructor
	public RedBus() {
		System.out.println("No argument constructor");
	}
	
	//All argument constructor
	public RedBus(String travelsName,String passengerName, int age,int noOfPassengers,String from,String to,
			float departure,float arrival,String driver,String conductor) {
		this.travelsName=travelsName;
		this.passengerName=passengerName;
		this.age=age;
		this.noOfPassengers=noOfPassengers;
		this.from=from;
		this.to=to;
		this.departure=departure;
		this.arrival=arrival;
		this.driver=driver;
		this.conductor=conductor;
		
	}
	

	
	

}
