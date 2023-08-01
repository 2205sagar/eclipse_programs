package com.xworkz.constructor;

public class FindVowel {

	public static void main(String[] args) {
		String type="It is raining heavily here";
		int count=0;
		for(int i=0;i<type.length();i++){
			//System.out.println(type.charAt(i));
			if(type.charAt(i)=='a'||type.charAt(i)=='e' || type.charAt(i)=='i'|| type.charAt(i)=='o' || type.charAt(i)=='u'){
			System.out.print(type.charAt(i)+" ");
			count++;
			System.out.println(count);
			}

	}

}
}
