package com.xworkz.constructor;

public class CountryRunner {

	public static void main(String[] args) {
	Karnataka c1 = new Bangalore();
		System.out.println("--------------------------------------------");
		Tamilnadu c2 = new Chennai();
		//Dynamic dispatcher- assigning child reference to parent class.
		System.out.println("--------------------------------------------");
		Object obj = new India();
		System.out.println("--------------------------------------------");
	    //WhatsappV3 v3 = (WhatsappV3) new WhatsappV2();
		Kerala c3=new Thiruvanantapuram();
		

	}

}
