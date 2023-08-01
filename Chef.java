package com.xworkz.constructor;

public class Chef extends Object {
	public int hashCode() {
		return 455;
	}
	public boolean equals(Object name) {
		return(name=="Kiran");
	}
	public String toString() {
		return "Chinese";
	}
	public Object clone() {
		return "clone";
	}
	public void finalize() {
		System.out.println("Cook is good");
	}
	
	public static void main(String[] args) {
		Chef name = new Chef();
		Chef name1 = new Chef();
		boolean val=name.equals(name1);
		System.out.println(val);
		int hashCode=name.hashCode();
		System.out.println(hashCode);
		String type=name.toString();
		System.out.println(type);
		System.out.println(name.clone());
		name.finalize();
	}

}
