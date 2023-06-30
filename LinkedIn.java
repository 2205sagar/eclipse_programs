package com.xworkz.constructor;

public class LinkedIn {
	public String userName;
	public String name;
	public String qualification;
	public String stream;
	public int yop;
	public float cgpa;
	public String fresher;
	public int yearsOfExperience;
	public int prevSalary;
	public int expSalary;
	public String companyName;
	public String refference;
	public String location;
	
	//No argument constructor
	public LinkedIn() {
		System.out.println("No arrgument constructor");
	}
	//All argument constructor
	public LinkedIn(String userName,String name,String qualification, String stream,int yop,float cgpa,String fresher,int yearsOfExperience, int prevSalary,
			int expSalary, String companyName, String refference, String location) {
		this.userName=userName;
		this.name=name;
		this.qualification=qualification;
		this.stream=stream;
		this.yop=yop;
		this.cgpa=cgpa;
		this.fresher=fresher;
		this.yearsOfExperience=yearsOfExperience;
		this.prevSalary=prevSalary;
		this.expSalary=expSalary;
		this.companyName=companyName;
		this.refference=refference;
		this.location=location;
	}
	
	//using setter method
	public void setName(String userName) {
		this.userName=userName;
	}
	public void setName1(String name) {
		this.name=name;
	}
	public void setName2(String qualification) {
		this.qualification=qualification;
	}
	public void setName3(String stream) {
		this.stream=stream;
	}
	public void setName4(int yop) {
		this.yop=yop;
	}
	public void setName5(float cgpa) {
		this.cgpa=cgpa;
	}
	public void setName6(String fresher) {
		this.fresher=fresher;
	}
	public void setName7(int yearsOfExperience) {
		this.yearsOfExperience=yearsOfExperience;
	}
	public void setName8(int prevSalary) {
		this.prevSalary=prevSalary;
	}
	public void setName9(int expSalary) {
		this.expSalary=expSalary;
	}
	public void setName10(String companyName) {
		this.companyName=companyName;
	}
	public void setName11(String refference) {
		this.refference=refference;
	}
	public void setName12(String location) {
		this.location=location;
	}
	

}
