package com.xworkz.constructor;

public class Palindrome {

	public static void main(String[] args) {
		String word="PENCIL";
		System.out.println(word);
		char[] word1=word.toCharArray();
		
		//char[] reverse=word.toCharArray();
		String reverse="";
		for(int j=word1.length-1;j>=0;j--) {
			//System.out.print(word1[j]+"");
			reverse=reverse+word1[j];
			
		}
		System.out.println(reverse); 
		System.out.println();
		if(word.equals(reverse)) {
			System.out.println("it's a palindrome");
			
		}
		else {
			System.out.println("its not a palindrome");
		}

	}

}
