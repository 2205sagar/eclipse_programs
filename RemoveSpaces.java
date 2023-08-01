package com.xworkz.constructor;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str="The climate is so good today";
		String str1="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				str1=str1+ch[i];
			}
			System.out.println("String before removing spacce:"+str);
			System.out.println("String after removing spaces:"+str1);
		}


	}

}
