package com.xworkz.constructor;

public class Phonepe {
	public int balance;
	public String sender;
	public String reciever;
	
	public Phonepe() {
		System.out.println("No argument constructor");
	}
	
	public Phonepe(int balance) {
		this.balance=balance;
		System.out.println("1 argument constructor");
		System.out.println(this.balance);
	}
	
	public Phonepe(int balance,String sender) {
		this.balance=balance;
		this.sender=sender;
		System.out.println("2 argument constructor");
		System.out.println(this.balance+" "+this.sender);
	}
	public Phonepe(int balance,String sender,String reciever) {
		this.balance=balance;
		this.sender=sender;
		this.reciever=reciever;
		System.out.println("3 argument constructor");
		System.out.println(this.balance+" "+this.sender+" "+this.reciever);
	}
	
}
