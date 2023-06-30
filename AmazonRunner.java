package com.xworkz.constructor.runner;

import com.xworkz.constructor.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon amazon= new Amazon();
		amazon.buy();
		amazon.sell();
		amazon.moneyTransfer();
		
		Amazon amazon2= new Amazon();
		amazon2.setMobiles("Vivo");
		String name=amazon2.getMobiles();
		System.out.println(name);
		amazon2.getMobiles();
		
		amazon2.setClothes("Variety");
		String clothes=amazon2.getClothes();
		System.out.println(clothes);
		amazon2.getClothes();
		
		amazon2.setShoes("Puma");
		String shoes=amazon2.getShoes();
		System.out.println(shoes);
		amazon2.getShoes();
		
		amazon2.setEarphones("Boat");
		String earphones=amazon2.getEarphones();
		System.out.println(earphones);
		amazon2.getEarphones();
		
		amazon2.setLaptop("Dell");
		String laptop=amazon2.getLaptop();
		System.out.println(laptop);
		amazon2.getLaptop();
		
		amazon2.setGroceries("cooking oil");
		String groceries=amazon2.getGroceries();
		System.out.println(groceries);
		amazon2.getGroceries();
		
		amazon2.setTv("Sony");
		String tv=amazon2.getTv();
		System.out.println(tv);
		amazon2.getTv();
		
		amazon2.setGifts("watch");
		String gifts=amazon2.getGifts();
		System.out.println(gifts);
		amazon2.getGifts();
		
		amazon2.setAccessories("charger");
		String accessories=amazon2.getAccessories();
		System.out.println(accessories);
		amazon2.getAccessories();
		

	}

}
