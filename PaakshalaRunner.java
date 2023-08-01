package com.xworkz.constructor.runner;

import com.xworkz.constructor.Paakshala;

public class PaakshalaRunner extends Paakshala {
	@Override
	public void eating() {
		System.out.println("this is eating method in pakshal runner");
	}
	@Override
	public void enjoy() {
		System.out.println("this is enjoy method in pakshal runner");
	}
	@Override
	public void drinking() {
		System.out.println("this is drinking method in paakshala runner");
	}

	public static void main(String[] args) {
		Paakshala paakshala=new PaakshalaRunner();
		paakshala.attending();
		paakshala.cooking();
		paakshala.service();
		paakshala.serving();
		

	}

}
