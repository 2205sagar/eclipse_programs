package com.xworkz.constructor;

public class Pogo {
	private String cartoons;
	private String shows;
	private int noOfShows;
	public int durationOfEachshow;
	public String peak;
	public int viewers;
	public int trp;
	public String mostWatchedShow;
	public String funnyShow;
	public String mythologicalShow;
	
	public Pogo() {
		System.out.println("No argument constructor");
	}
	public Pogo(String cartoons,String shows, int noOfShows,int durationOfEachshow,String peak, int viewers, int trp, String mostWatchedShow,String funnyShow,String mythologicalShow) {
		System.out.println("All argument constructor");
		this.cartoons=cartoons;
		this.shows=shows;
		this.noOfShows=noOfShows;
		this.durationOfEachshow=durationOfEachshow;
		this.peak=peak;
		this.viewers=viewers;
		this.trp=trp;
		this.mostWatchedShow=mostWatchedShow;
		this.funnyShow=funnyShow;
		this.mythologicalShow=mythologicalShow;
	}
	public static void watch() {
		System.out.println("Static method");
		System.out.println("watch method");
	}
	public void listen() {
		System.out.println("Non static method");
		System.out.println("listen method");
	}
	public void laugh() {
		System.out.println("Non static method");
		System.out.println("laugh method");
	}
	
	//setters and geters
	public void setCartoons(String cartoons) {
		this.cartoons=cartoons;
	}
	public String getCartoons() {
		return cartoons;
	}
	public void setShows(String shows) {
		this.shows=shows;
	}
	public String getShows() {
		return shows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows=noOfShows;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setDurationOfEachshow(int durationOfEachshow) {
		this.durationOfEachshow=durationOfEachshow;
	}
	public int getDurationOfEachshow() {
		return durationOfEachshow;
	}
	public void setPeak(String peak) {
		this.peak=peak;
	}
	public String getPeak() {
		return peak;
	}
	public void setViewers(int viewers) {
		this.viewers=viewers;
	}
	public int getViewers() {
		return viewers;
	}
	public void setTrp(int trp) {
		this.trp=trp;
	}
	public int getTrp() {
		return trp;
	}
	public void setMostWatchedShow(String mostWatchedShow) {
		this.mostWatchedShow=mostWatchedShow;
	}
	public String getMostWatchedShow() {
		return mostWatchedShow;
	}
	public void setFunnyShow(String funnyShow) {
		this.funnyShow=funnyShow;
	}
	public String getFunnyShow() {
		return funnyShow;
	}
	public void setMythologicalShow(String mythologicalShow) {
		this.mythologicalShow=mythologicalShow;
	}
	public String getMythologicalShow() {
		return mythologicalShow;
	}

}
