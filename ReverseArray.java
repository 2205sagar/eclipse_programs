package com.xworkz.constructor;

public class ReverseArray {  
	    public static void main(String[] args) {  
	     
	        int [] arr = new int [] {10, 45, 7, 9, 2};  
	        System.out.println(" array elements are: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	      
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }
	    }
}
