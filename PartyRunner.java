package com.xworkz.constructor.runner;

import com.xworkz.constructor.Party;

public class PartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Party party= new Party();
		party.dance();
		party.eat();
		party.drink();
		party.enjoy();
		
		Party party2= new Party();
		party2.setLocation("BTM");
		String location=party2.getLocation();
		System.out.println(location);
		
		party2.setName("Kiran");
		String name=party2.getName();
		System.out.println(name);
		
		party2.setFriends("Close friends");
		String friends=party2.getFriends();
		System.out.println(friends);
		
		party2.setReason("Birthday");
		String reason=party2.getReason();
		System.out.println(reason);
		
		party2.setNumber(8);
		int number=party2.getNumber();
		System.out.println(number);
		
		party2.setInvitation("Sent");
		String invitation=party2.getInvitation();
		System.out.println(invitation);
		
		party2.setFood("Preapared menu");
		String food=party2.getFood();
		System.out.println(food);
		
		party2.setDrinks("Soft drinks");
		String drinks=party2.getDrinks();
		System.out.println(drinks);
		
		party2.setBudget(10000);
		int budget=party2.getBudget();
		System.out.println(budget);
		
		party2.setTime(22.00f);
		float time=party2.getTime();
		System.out.println(time);

	}

}
