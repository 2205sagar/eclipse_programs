package com.xworkz.constructor.runner;

import com.xworkz.constructor.Ott;

public class OttRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ott pltfrm = new Ott();
		String ref = pltfrm.toString();
		System.out.println(ref);
		
		Ott pltfrm1 = new Ott("HOTSTAR",500);
		String ref2 = pltfrm1.toString();
		System.out.println(ref2);
		
		Ott pltfrm2 = new Ott("AmazonPrime",400);
		boolean result=pltfrm1.equals(pltfrm2);
		System.out.println(result);
		
		Ott pltfrm3 = new Ott("Zee5",300);
		boolean result1 = pltfrm2.equals(pltfrm3);
		System.out.println(result1);
		
		Ott pltfrm4 = new Ott("HOTSTAR",500);
		boolean result2 = pltfrm1.equals(pltfrm4);
		System.out.println(result2);

	}

}
