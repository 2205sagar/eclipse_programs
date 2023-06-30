package com.xworkz.constructor;

public class Avatar {
	private String directorName;
	public int budget;
	private String actorsName[];
	
	public Avatar() {
		System.out.println("No argument constructor");
	}
	public void setDirectorName(String directorName) {
		this.directorName=directorName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setBudget(int buget) {
		this.budget=budget;
	}
	public int getBudget() {
		return budget;
	}
	public void setActorsName(String actorsName[]) {
		this.actorsName=actorsName;
	}
	public String[] getActorsName() {
		return actorsName;
	}
}
