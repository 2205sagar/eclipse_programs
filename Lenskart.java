package com.xworkz.constructor;
//reversing a string 
public class Lenskart {
	public static void main(String[] args) {
		String name="Founder is piyush goyal";
		/*String[] word= name.split(" ");
		System.out.println(name.split(name));
		for(int i=0;i<word.length;i++) {
			System.out.print(word[i]+" ");
		}
		System.out.println();
		String[] word1=name.split(" ");
		for(int i=0;i<word1.length;i++) {
			System.out.print(word1[i]+" ");
		}*/
		System.out.println();
		char[] reverse=name.toCharArray();
		System.out.println(reverse);
		for(int j=reverse.length-1;j>=0;j--) {
			System.out.print(reverse[j]+" ");
		}
	}

}


/*	for(int i=o;i<type.lenght();i++){
	sop(type.charAt(i));
	if(type.charAt(i)=='e' or type.charAt(i)=='i'){
	sop(type.charAt(i));
	}
	
	} */