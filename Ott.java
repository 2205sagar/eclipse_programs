package com.xworkz.constructor;

public class Ott {
	String name;
	int noOfFilms;
	
	
	public Ott() {
		System.out.println("This is no-argument constructor for OTT class");
	}
	public Ott(String name,int noOfFilms) {
		this.name=name;
		this.noOfFilms=noOfFilms;
	}
	public String toString() {
		return "OTT[name='"+name+"' ,"+" noOfFilms='"+noOfFilms+"']";
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			Ott o = (Ott)obj;   
			if(this.name==o.name && this.noOfFilms==o.noOfFilms)
				return true;
			return false;
		
		
		
	}


}
