package com.xworkz.constructor.runner;

import com.xworkz.constructor.Pogo;

public class PogoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pogo pogo= new Pogo();
		pogo.watch();
		pogo.listen();
		pogo.laugh();
		
		Pogo pogo2=new Pogo();
		pogo2.setCartoons("kids");
		String cartoons=pogo2.getCartoons();
		System.out.println(cartoons);
		pogo2.getCartoons();
		
		pogo2.setShows("Unlimited");
		String shows=pogo2.getShows();
		System.out.println(shows);
		pogo2.getShows();
		
		pogo2.setNoOfShows(9);
		int noOfShows=pogo2.getNoOfShows();
		System.out.println(noOfShows);
		
		pogo2.setDurationOfEachshow(30);
		int durationOfEachshow=pogo2.getDurationOfEachshow();
		System.out.println(durationOfEachshow);
		
		pogo2.setPeak("Sunday");
		String peak=pogo2.getPeak();
		System.out.println(peak);
		
		pogo2.setViewers(1226);
		int viewers=pogo2.getViewers();
		System.out.println(viewers);
		
		pogo2.setTrp(9);
		int trp=pogo2.getTrp();
		System.out.println(trp);
		
		pogo2.setMostWatchedShow("Tom and Jerry");
		String mostWatchedShow=pogo2.getMostWatchedShow();
		System.out.println(mostWatchedShow);
		
		pogo2.setFunnyShow("Mr Bean");
		String funnyShow=pogo2.getFunnyShow();
		System.out.println(funnyShow);
		
		pogo2.setMythologicalShow("Ramayan");
		String mythologicalShow=pogo2.getMythologicalShow();
		System.out.println(mythologicalShow);

	}

}
