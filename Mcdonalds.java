package com.xworkz.constructor;

public class Mcdonalds {
	static String name;
	static String location;
	static String type;
	public int price=200;
	public int noOfItems=12;
	
	public static void setValue(String fname,String flocation,String ftype){
		System.out.println("The set value of McDonalds is");
		name=fname;
		location=flocation;
		type=ftype;
	}
	//public void SetValue(int price,int noOfItems) {
	//	 price=price;
	//	noOfItems=noOfItems;
	//}
public static void display(){
	    System.out.println("Name :"+name);
		System.out.println("Location is:"+location);
		System.out.println("Type:"+type);
	
}
public void display1() {
	System.out.println("Price is:"+price);
	System.out.println("Num Of Items is:"+noOfItems);
}

}
