package com.xworkz.constructor.runner;

import com.xworkz.constructor.AirCooler;

public class AirCoolerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCooler airCooler=new AirCooler();
		airCooler.setTemperature(35);
		int temperature=airCooler.getTemperature();
		System.out.println(temperature);
		String condition=airCooler.condition(airCooler.getTemperature());
		System.out.println("Weather condition is:"+condition);

	}

}
