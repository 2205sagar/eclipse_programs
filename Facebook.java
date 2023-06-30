package com.xworkz.constructor;

public class Facebook {
	public String firstName;
	public String lastName;
	public String gender;
	public String dob;
	public String phoneNum;
	public String emailID;
	public String password;
	
	public Facebook() {
		System.out.println("No argument constructor");
	}
	public Facebook(String firstName, String lastName, String gender, String dob, String phoneNum, String emailID, String password) {
		System.out.println("All argument constructor");
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dob=dob;
		this.phoneNum=phoneNum;
		this.emailID=emailID;
		this.password=password;
	}
	
	public void register() {
		System.out.println("No arguments");
	}
	public void register(String firstName) {
		this.firstName=firstName;
		System.out.println("First name is:"+this.firstName);
	}
	public void register(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName);
	}
	public void register(String firstName, String lastName, String gender) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName+ ", Gender:"+this.gender);
		
	}
	public void register(String firstName, String lastName, String gender, String dob) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dob=dob;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName+ ", Gender:"+this.gender+", dob:"+this.dob);
		}
	public void register(String firstName, String lastName, String gender, String dob, String phoneNum) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dob=dob;
		this.phoneNum=phoneNum;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName+ ", Gender:"+this.gender+", dob:"+this.dob+",Phone number:"+this.phoneNum);
	}
	public void register(String firstName, String lastName, String gender, String dob, String phoneNum, String emailID) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dob=dob;
		this.phoneNum=phoneNum;
		this.emailID=emailID;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName+ ", Gender:"+this.gender+", dob:"+this.dob+",Phone number:"+this.phoneNum+", Email-Id:"+this.emailID);
	}
	public void register(String firstName, String lastName, String gender, String dob, String phoneNum, String emailID, String password) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dob=dob;
		this.phoneNum=phoneNum;
		this.emailID=emailID;
		this.password=password;
		System.out.println("First name:"+this.firstName+", Last name:"+this.lastName+ ", Gender:"+this.gender+", dob:"+this.dob+",Phone number:"+this.phoneNum+", Email-Id:"+this.emailID+",password:"+this.password);
	}
	
	public String login(String firstName, String password) {
		if(firstName==null) {
			return null;
		} else if(password==null) {
			return null;
					}else {
						return firstName;
					}
	}

}
