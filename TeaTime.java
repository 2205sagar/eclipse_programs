package com.xworkz.constructor;

import java.util.Date;

public abstract class TeaTime {
	public String type;
	public String location;
	public int price;
	public Date date;
	
	public TeaTime() {
		System.out.println("This is teaTime constructor");
	}
	//concrete or normal methods
	public void watingTime() {
		System.out.println("you guys are wating time...");
	}
	public void goodTime() {
		System.out.println("its a good time");
	}
	public void review() {
		System.out.println("Tea is good");
	}
	

}
