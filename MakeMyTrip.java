package com.xworkz.constructor;

public class MakeMyTrip {
	private String travelsName;
	private String passengerName;
	private int age;
	private int noOfPassengers;
	public String from;
	public String to;
	public float departure;
	public float arrival;
	public String driver;
	public String conductor;
	
	public  MakeMyTrip() {
		System.out.println("No argument constructor");
	}
	public  MakeMyTrip(String travelsName, String passengerName, int age, int noOfPassengers, String from, String to, float departure, float arrival, String driver, String conductor) {
		System.out.println("All argument constructor");
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
	public static void book() {
		System.out.println("static method");
		System.out.println("book method");
	}
	public static void pay() {
		System.out.println("static method");
		System.out.println("pay method");
	}
	public void travel() {
		System.out.println("non static method");
		System.out.println("travel method");
	}
	public void reach() {
		System.out.println("non static method");
		System.out.println("reach method");
	}
	
	//setters and getters
	public void setTravelsName(String travelsName) {
		this.travelsName=travelsName;
	}
	public String  getTravelsName() {
		return travelsName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName=passengerName;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers=noOfPassengers;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setFrom(String from) {
		this.from=from;
	}
	public String getFrom() {
		return from;
	}
	public void setTo(String to) {
		this.to=to;
	}
	public String getTo() {
		return to;
	}
	public void setDeparture(float departure) {
		this.departure=departure;
	}
	public float getDeparture() {
		return departure;
	}
	public void setArrival(float arrival) {
		this.arrival=arrival;
	}
	public float getArrival() {
		return arrival;
	}
	public void setDriver(String driver) {
		this.driver=driver;
	}
	public String getDriver() {
		return driver;
	}
	public void setConductor(String conductor) {
		this.conductor=conductor;
	}
	public String getConductor() {
		return conductor;
	}
	

}
