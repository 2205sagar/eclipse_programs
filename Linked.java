package com.xworkz.constructor;

	public class Linked extends Application{
		public String userName;
		public String password;
		public int users;
		
		public Linked() {
			System.out.println("LinkedIn no-arguments constructor");
		}

		public Linked(String userName, String password, int users) {
			this.userName = userName;
			this.password = password;
			this.users = users;
		}
		
		public void follow() {
			System.out.println("LinkedIn follow method");
		}
		

	}


