package com.xworkz.constructor;


public class Bisleri {

	public static void main(String[] args) {
		String name="Bisleri is a mineral water company.";
		System.out.println(name);
		System.out.println("Length using method:"+name.length());
		//lenght using for loop and charArray()
		char[] nameList=name.toCharArray();
		System.out.println("Lenght using charArray[]:"+nameList.length);
		for(int i=0;i<nameList.length;i++){
			System.out.println(nameList[i]+" ");
		}
		//finding num of words
		System.out.println();
		System.out.println("Num of words:"+name.split(" ").length);

	//coverting char[] to String>
	String[] word1= name.split(" ");
			
			for(int i=0;i<word1.length;i++) {
		System.out.println(word1[i]+" ");
	}
	//Reversing the sentence
	
	System.out.println();
	char[] reverse=name.toCharArray();
	for(int j=reverse.length-1;j>=0;j--) {
		System.out.println(reverse[j]+" ");
	}
	
		

}
}
