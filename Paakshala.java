package com.xworkz.constructor;

public abstract class Paakshala {
	public String name;
	public String location;
	public String items;
	public String speciality;
	
	public Paakshala() {
		System.out.println("No argument constructor");
	}
	public Paakshala(String name,String location,String items,String speciality) {
		System.out.println("All argument constructor");
		this.name=name;
		this.location=location;
		this.items=items;
		this.speciality=speciality;
	}
	//concrete or normal methods
	public void cooking() {
		System.out.println("This is cooking method");
	}
	public void serving() {
		System.out.println("This is serving method");
	}
	public void attending() {
		System.out.println("this is attending method");
	}
	public void service() {
		System.out.println("This is service method");
	}
	//abstract method
	public abstract void eating();
	
	public abstract void enjoy();
	public abstract void drinking();
	

}
