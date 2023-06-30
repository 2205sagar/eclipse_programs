package com.xworkz.constructor.runner;

import com.xworkz.constructor.Avatar;

public class AvatarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avatar avatar=new Avatar();
		avatar.setDirectorName("Ravi");
		avatar.setBudget(10000);
		String name=avatar.getDirectorName();
		System.out.println(name);
		System.out.println(avatar.getBudget());
		if(avatar.getBudget()<=1000) {
			System.out.println("Budget is less than 1000");
		}
		else {
			System.out.println("Budget is greater than 1000");
		}
		
		String actorsName[]= {"Sarvesh","ravi","Sagar","Hari"};
		avatar.
		
	}

}
