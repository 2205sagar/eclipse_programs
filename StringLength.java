package com.xworkz.constructor;

public class StringLength {

	public static void main(String[] args) {
		String word="Hardwork beats talent, when talent dosen't work hard.";
		System.out.println(word);
		System.out.println("Length of the string using methods:"+word.length());
		
		//lenght of the string using for loop and toCharArray()
		char[] wordList= word.toCharArray();
		System.out.println("Length using charArray:"+wordList.length);
		for(int i=0;i<wordList.length;i++) {
			System.out.print(wordList[i]+" ");
		}

	}

}
