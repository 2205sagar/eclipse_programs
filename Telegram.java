package com.xworkz.constructor;

public class Telegram {
	private String signUp;
	private String signIn;
	private String links;
	private String movies;
	public String webSeries;
	public String groups;
	public String eduction;
	public String jobs;
	public String socialMedia;
	public int noOfGroups;
	
	public Telegram() {
		System.out.println("No argument constructor");
	}
	public Telegram(String signUp, String signIn, String links, String movies, String webSeries, String groups, String eduction, String jobs, String socialMedia, int noOfGroups) {
		System.out.println("All argument constructor");
		this.signUp=signUp;
		this.signIn=signIn;
		this.links=links;
		this.movies=movies;
		this.webSeries=webSeries;
		this.groups=groups;
		this.eduction=eduction;
		this.jobs=jobs;
		this.socialMedia=socialMedia;
		this.noOfGroups=noOfGroups;
	}
	public static void entertainment() {
		System.out.println("Static method");
		System.out.println("Entertainment method");
	}
	public void watch() {
		System.out.println("Non static method");
		System.out.println("watch method");
	}
	public void share() {
		System.out.println("Non static method");
		System.out.println("Share method");
	}
	public void recieve() {
		System.out.println("Non static method");
		System.out.println("Recieve method");
	}
	
	//setters and getters
	public void setSignUp(String signUp) {
		this.signUp=signUp;
	}
	public String getSignUp() {
		return signUp;
	}
	public void setSignIn(String signIn) {
		this.signIn=signIn;
	}
	public String getSignIn() {
		return signIn;
	}
	public void setLinks(String links) {
		this.links=links;
	}
	public String getLinks() {
		return links;
	}
	public void setMovies(String movies) {
		this.movies=movies;
	}
	public String getMovies() {
		return movies;
	}
	public void setWebSeries(String webSeries) {
		this.webSeries=webSeries;
	}
	public String getwebSeries() {
		return webSeries;
	}
	public void setGroups(String groups) {
		this.groups=groups;
	}
	public String getGroups() {
		return groups;
	}
	public void setEduction(String eduction) {
		this.eduction=eduction;
	}
	public String getEduction() {
		return eduction;
	}
	public void setJobs() {
		this.jobs=jobs;
	}
	public String getJobs() {
		return jobs;
	}
	public void setSocialMedia(String socialMedia) {
		this.socialMedia=socialMedia;
	}
	public String getSocialMedia() {
		return socialMedia;
	}
	public void setNoOfGroups(int noOfGroups) {
		this.noOfGroups=noOfGroups;
	}
	public int getNoOfGroups() {
		return noOfGroups;
	}
}
