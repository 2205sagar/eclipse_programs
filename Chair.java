package com.xworkz.constructor;

import java.util.Date;

public class Chair {
	public static void main(String[] args) {
		String type="Office chair";
	    String material="Plastic";
	    int price=800;
	    
	    System.out.println(type.chars());
	    System.out.println(type.isBlank());
	    System.out.println(type.concat(material)); //adds both the string values
	    System.out.println(type.isEmpty());  //checks whether the string is empaty or not
	    System.out.println(type.length());   // to know the length
	    System.out.println(type.toLowerCase());  // converts all chars to lowercase
	    System.out.println(type.toUpperCase());  //converts all chars to uppercase
	    System.out.println(type.compareTo(material)); // compares one string to other
	    System.out.println(type.contains(material)); // checks whether both contains same values
	    System.out.println(type.startsWith("S"));   //to check the starting letter
	    System.out.println(type.replace("S", "P")); //to replace letters
	    System.out.println(type.replaceAll(type, "Steel")); //to replace complete
	    
		
	}
	
}
