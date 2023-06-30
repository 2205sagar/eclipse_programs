package com.xworkz.constructor;

public class Party {
	private String location;
	private String name;
	private String friends;
	private String reason;
	public int number;
	public String invitation;
	public String food;
	public String drinks;
	public int budget;
	public float time;
	
	public Party() {
		System.out.println("no argument constructor");
	}
	public Party(String location, String name, String friends, String reason, int number, String invitation, String food, String drinks, int budget, float time) {
		System.out.println("All argument constructor");
		this.location=location;
		this.name=name;
		this.friends=friends;
		this.reason=reason;
		this.number=number;
		this.invitation=invitation;
		this.food=food;
		this.drinks=drinks;
		this.budget=budget;
		this.time=time;
	}
	public static void eat() {
		System.out.println("static method");
		System.out.println("eat method");
	}
	public static void drink() {
		System.out.println("static method");
		System.out.println("drink method");
	}
	public void dance() {
		System.out.println("no ststic method");
		System.out.println("dance method");
	}
	public void enjoy() {
		System.out.println("non static method");
		System.out.println("enjoy method");
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setFriends(String friends) {
		this.friends=friends;
	}
	public String getFriends() {
		return friends;
	}
	public void setReason(String reason) {
		this.reason=reason;
	}
	public String getReason() {
		return reason;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setInvitation(String invitation) {
		this.invitation=invitation;
	}
	public String getInvitation() {
		return invitation;
	}
	public void setFood(String food) {
		this.food=food;
	}
	public String getFood() {++qz
		return food;
	}
	public void setDrinks(String drinks) {
		this.drinks=drinks;q
	}
	public String getDrinks() {i
		return drinks;
	}
	public void setBudget(int budget) {
		this.budget=budget;
	}
	public int getBudget() {
		return budget;
	}
	public void setTime(float time) {
		this.time=time;
	}
	public float getTime() {
		return time;
	}

}
