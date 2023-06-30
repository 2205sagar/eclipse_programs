package com.xworkz.constructor.runner;

import com.xworkz.constructor.Hireact;

public class HireactRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hireact job =new Hireact();
		
		Hireact job1=new Hireact("Sunil","B.E","Java","Fresher",35000);
		System.out.println("Name is:"+job1.name);
		System.out.println(job1.qualification);
		System.out.println(job1.skills="Java");
		System.out.println(job1.type);
		System.out.println(job1.expSalary);
	}

}
