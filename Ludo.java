package com.xworkz.constructor;

public class Ludo {
	
	public int players;
	public String colour;
	public String mode;
	
	public Ludo() {
		System.out.println("No-Argument Constructor");
	}
	
	public Ludo(int players,String colour,String mode) {
		System.out.println("All Argument Constructor");
		this.players=players;
		this.colour=colour;
		this.mode=mode;
	}
	
	public static void playing() {
		System.out.println("Static method");
		System.out.println("Playing method");
	}
	public void dice() {
		System.out.println("This is non-static method");
		System.out.println("Dice method");
	}
	
	public void move() {
		System.out.println("This is non-static method");
		System.out.println("Move method");
	}

}

