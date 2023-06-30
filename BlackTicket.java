package com.xworkz.constructor;

public class BlackTicket {
	public int price;
	public String sellerName;
	public String buyerName;
	public String location;
	
	public BlackTicket() {
		//this(120);
		System.out.println("No argument constructor");
	}
	
	public BlackTicket(int price) {
		
		//this(120,"Hari");
		this.price=price;
		System.out.println("1 argument constructor");
		System.out.println(this.price);
	}
	
	public BlackTicket(int price,String sellerName) {
		this.price=price;
		this.sellerName=sellerName;
		System.out.println("2 argument constructor");
		System.out.println(this.price+" "+this.sellerName);
	}
	public BlackTicket(int price,String sellerName,String buyerName) {
		this.price=price;
		this.sellerName=sellerName;
		this.buyerName=buyerName;
		System.out.println("3 argument constructor");
		System.out.println(this.price+" "+this.sellerName+" "+this.buyerName);
	}
	public BlackTicket(int price,String sellerName,String buyerName,String location) {
		System.out.println("4 argument constructor");
	}

}
