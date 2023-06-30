package com.xworkz.constructor.runner;

import com.xworkz.constructor.Ludo;

public class LudoRunner {
	public static void main(String args[]) {
		Ludo ludo =new Ludo();
		ludo.dice();
		ludo.move();
		ludo.playing();
		Ludo.playing();
	}

}
//Reference. is used for instance methods and static methods both.
//Class. is only used for static methods.
