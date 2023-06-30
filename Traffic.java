package com.xworkz.constructor;

public class Traffic {
	public String location;
	public String place;
	public int twoWheelers;
	public int fourWheelers;
	public int others;
	public String nextSignal;
	public float waitingTime;
	public float alowedTime;
	public String peakTime;
	public float distance ;
	
	public Traffic() {
		System.out.println("default constructor");
		
	}
	
	public Traffic(String location, String place, int twoWheelers,int fourWheelers,int others,String nextSignal,
			float waitingTime,float alowedTime,String peakTime,float distance) {
		this.location=location;
		this.place=place;
		this.twoWheelers=twoWheelers;
		this.fourWheelers=fourWheelers;
		this.others=others;
		this.nextSignal=nextSignal;
		this.waitingTime=waitingTime;
		this.alowedTime=alowedTime;
		this.peakTime=peakTime;
		this.distance=distance;
	}

}
