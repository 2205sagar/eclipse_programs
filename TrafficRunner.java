package com.xworkz.constructor.runner;

import com.xworkz.constructor.Traffic;

public class TrafficRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traffic signal= new Traffic(); //("Bangalore","BTM",60,22,18,"Banashankari",2.30f,1.12f,19.0f,12);
		System.out.println(signal.location);
		System.out.println(signal.place);
		System.out.println(signal.twoWheelers);
		System.out.println(signal.fourWheelers);
		System.out.println(signal.others);
		System.out.println(signal.nextSignal);
		System.out.println(signal.waitingTime);
		System.out.println(signal.alowedTime);
		System.out.println(signal.peakTime);
		System.out.println(signal.distance);

	}
	

}
