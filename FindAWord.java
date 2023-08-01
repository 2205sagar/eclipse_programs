package com.xworkz.constructor;

public class FindAWord {

	public static void main(String[] args) {
		String sentence="Good morning guys,how are you.";
		String[] sentenceList= sentence.split(" ");
		for(int i=0;i<sentenceList.length;i++) {
			if(sentenceList[i].equals("morning")) {
				//char[] word = sentenceList[i].toCharArray();
				System.out.println(sentenceList[i]);
			}
		}

	}

}
/*for(int i=0;i<sentence.length();i++) {
//System.out.print(sentence.charAt(i));
	if(sentence.charAt(i)=='m') {
		System.out.println(sentence.charAt(i));
	}

}*/
