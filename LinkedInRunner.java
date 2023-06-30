package com.xworkz.constructor.runner;

import com.xworkz.constructor.LinkedIn;

public class LinkedInRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedIn job= new LinkedIn();
		
		LinkedIn job1=new LinkedIn("SGR","Sagar","B.E","Mechanical",2021,8.49f,"yes",0,0,30000,"NA","abhi","Bangalore");
		System.out.println(job1.userName);
		System.out.println(job1.name);
		System.out.println(job1.qualification);
		System.out.println(job1.stream);
		System.out.println(job1.yop);
		System.out.println(job1.cgpa);
		System.out.println(job1.fresher);
		System.out.println(job1.yearsOfExperience);
		System.out.println(job1.prevSalary);
		System.out.println(job1.expSalary);
		System.out.println(job1.companyName);
		System.out.println(job1.refference);
		System.out.println(job1.location);
		
		LinkedIn job2= new LinkedIn();
		job2.setName("XYZ");
		System.out.println("User name is:"+job2.userName);
		job2.setName1("Kiran");
		System.out.println("Name is:"+job2.name);
		
	}
	
}
