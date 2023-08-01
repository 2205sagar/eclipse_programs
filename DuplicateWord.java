package com.xworkz.constructor;

public class DuplicateWord {

	public static void main(String[] args) {
		String traineeName="Aishwarya,Ravi,Hari,Sarvesh,Sagar,Aishwarya";
		
		String[] name=traineeName.split(",");
		
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[j]);
				}
			}
		}

	}

}
