package com.xworkz.constructor.runner;

import com.xworkz.constructor.Facebook;

public class FacebookRunner {

	public static void main(String[] args) {
		Facebook fb= new Facebook();
		fb.register();
		fb.register("Sagar");
		fb.register("Sagar","Savasi");
		fb.register("Sagar","Savasi","Male");
		fb.register("Sagar","Savasi","Male","05 July 1999");
		fb.register("Sagar","Savasi","Male","05 July 1999","7676739427");
		fb.register("Sagar","Savasi","Male","05 July 1999","7676739427","sagarsavasi@gmail.com");
		fb.register("Sagar","Savasi","Male","05 July 1999","7676739427","sagarsavasi@gmail.com","Sgr@7875");
		
		fb.login("Sagar","xyz@123");
		System.out.println(fb.login("Sagar","xyz@123"));

	}

}
