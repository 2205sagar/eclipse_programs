package com.xworkz.constructor;

public class WhiteSpace {

	public static void main(String[] args) {
		String ws="The climate is so good today";
		int count=0;
		char[] c=ws.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]==' '){
				count++;
			}
		}
		System.out.println("Total num of spaces:"+count);

	}

}
