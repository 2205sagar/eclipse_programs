package com.xworkz.constructor;

public class AirCooler {
	private String brand;
	private String capacity;
	private int temperature;
	private String weatherCondition;
	
	public AirCooler() {
		System.out.println("No argument constructor");
	}
	public AirCooler(String brand, String capacity, int temperature, String weatherCondition) {
		System.out.println("All argument constructor");
		this.brand=brand;
		this.capacity=capacity;
		this.temperature=temperature;
		this.weatherCondition=weatherCondition;
	}
	
	public void setTemperature(int temperature) {
		this.temperature=temperature;
	}
	public int getTemperature() {
		return temperature;
	}
	public String condition(int temperature) {
		if(temperature<10) {
			return "cool";
		}
		if(temperature>10 || temperature<20) {
			return "normal";
		}
		if(temperature>20 || temperature<30) {
			return "moderate";
		}
		if(temperature>30) {
			return "hot";
		}
		else {
			return "invalid";
		}
	}

}
