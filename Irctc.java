package com.xworkz.constructor;

public class Irctc {
	//literal way
	public String name="Priya";
	public int price=550;
	public String seatNumber="D12";
	public String location="Dharwad";
	
	public Irctc() {
		System.out.println("No argument constructor");
	}
	
	//assignig values to the variables by using constructor
	public Irctc(String name,int price,String seatNumber,String location) {
	System.out.println("argument constructor");
	this.name=name;
	this.price=price;
	this.seatNumber=seatNumber;
	this.location=location;
	}
	
	//using setter mehod to assign values
	public void setName(String name) {
		this.name=name;
	}
	
	//using getter method
	public String getName() {
		return this.name;
	}
	
	
	

}
