package com.xworkz.constructor.runner;

public class MilitaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army af= new Army();
		af.armyDetails();
		af.armyDetails("Airforce");
		af.armyDetails("Airforce","Bhuj");
		af.armyDetails("Airforce","Bhuj","Delta");
		af.armyDetails("Airforce","Bhuj","Delta",1200);
		af.armyDetails("Airforce","Bhuj","Delta",1200,50);
		af.armyDetails(new Date());

	}

}
