package com.xworkz.constructor;

import java.util.Date;

public class Military {
	private String type;
	private String location;
	private String campName;
	private int numOfSoldiers;
	private int numOfMisions;
	private Date joinDate;

	public Military() {
		System.out.println("No argument constructor");
	}
	public Military(String type, String location, String campName, int numOfSoldiers, int numOfMisions, Date joinDate) {
		System.out.println("All argument constructor");
		this.type=type;
		this.location=location;
		this.campName=campName;
		this.numOfSoldiers=numOfSoldiers;
		this.numOfMisions=numOfMisions;
		this.joinDate=joinDate;
		
	}
	public void defencing() {
		System.out.println("this is a defence method");
	}
	
	

}
