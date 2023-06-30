package com.xworkz.constructor;

public class Amazon {
	private String mobiles;
	private String clothes;
	private String shoes;
	private String earPhones;
	public String laptop;
	public String groceries;
	public String tv;
	public String gifts;
	public String accessories;
	
	public Amazon() {
		System.out.println("No argument constructor");
	}
	
	public Amazon( String mobiles,String clothes,String shoes,String earPhones,String laptop,String groceries,String tv,String gifts, String accessories) {
		System.out.println("All argument constructor");
		this.mobiles=mobiles;
		this.clothes=clothes;
		this.shoes=shoes;
		this.earPhones=earPhones;
		this.laptop=laptop;
		this.groceries=groceries;
		this.tv=tv;
		this.gifts=gifts;
		this.accessories=accessories;
		
	}
	public static void buy() {
		System.out.println("Static method");
		System.out.println("buy method");
	}
	public void sell() {
		System.out.println("Non static method");
		System.out.println("Sell method");
	}
	public void moneyTransfer() {
		System.out.println("Non static method");
		System.out.println("Money transfer method");
	}
	
	//setters and getters
	public void setMobiles (String mobiles) {
		this.mobiles=mobiles;
	}
	public String getMobiles(){
		return mobiles;
	}
	public void setClothes(String clothes) {
		this.clothes=clothes;
	}
	public String getClothes() {
		return clothes;
	}
	public void setShoes(String shoes) {
		this.shoes=shoes;
	}
	public String getShoes() {
		return shoes;
	}
	public void setEarphones(String earphones) {
		this.earPhones=earPhones;
	}
	public String getEarphones() {
		return earPhones;
	}
	public void setLaptop(String laptop) {
		this.laptop=laptop;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setGroceries(String groceries) {
		this.groceries=groceries;
	}
	public String getGroceries() {
		return groceries;
	}
	public void setTv(String tv) {
		this.tv=tv;
	}
	public String getTv() {
		return tv;
	}
	public void setGifts(String gifts) {
		this.gifts=gifts;
	}
	public String getGifts() {
		return gifts;
	}
	public void setAccessories(String accessories) {
		this.accessories=accessories;
	}
	public String getAccessories() {
		return accessories;
	}
}
