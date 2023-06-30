package com.xworkz.constructor.runner;

import com.xworkz.constructor.Telegram;

public class TelegramRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telegram telegram= new Telegram();
		telegram.watch();
		telegram.recieve();
		telegram.share();
		telegram.entertainment();
		
		Telegram telegram2=new Telegram();
		telegram2.setSignUp("Sign up");
		String signUp=telegram2.getSignUp();
		System.out.println(signUp);
		
		telegram2.setSignIn("Sign in");
		String signIn=telegram2.getSignIn();
		System.out.println(signIn);
		
		telegram2.setLinks("Movie links");
		String links=telegram2.getLinks();
		System.out.println(links);
		
		telegram2.setMovies("New movies");
		String movies=telegram2.getMovies();
		System.out.println(movies);
		
		telegram2.setWebSeries("Money heist");
		String webSeries=telegram2.getwebSeries();
		System.out.println(webSeries);
		
		telegram2.setGroups("All type of groups");
		String groups=telegram2.getGroups();
		System.out.println(groups);
		
		telegram2.setEduction("groups");
		String eduction=telegram2.getEduction();
		System.out.println(eduction);
		
		telegram2.setJobs("offers");
		String jobs=telegram2.getJobs();
		System.out.println(jobs);
		
		telegram2.setSocialMedia("Telegram");
		String socialMedia=telegram2.getSocialMedia();
		System.out.println(socialMedia);
		
		telegram2.setNoOfGroups(8);
		int noOfGroups=telegram2.getNoOfGroups();
		System.out.println(noOfGroups);

	}

}
