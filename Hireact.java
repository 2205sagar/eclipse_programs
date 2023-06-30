package com.xworkz.constructor;

public class Hireact {
	public String name;
	public String qualification;
	public String skills;
	public String type;
	public int expSalary;
	
	//NO ARGUMENT CONSTRUCTOR
	public Hireact() {
		System.out.println("No argument constructor");
	}
	public Hireact(String name,String qualification,String skills,String type,int expSalary) {
		this.name=name;
		this.qualification=qualification;
		this.skills=skills;
		this.type=type;
		this.expSalary=expSalary;
	}
}
