package com.java;

public class Puncuation {

	public static void main(String[] args) {
		  int count = 0;  
	        String str = "abcd@gmail.com";  
	        for (int i = 0; i < str.length(); i++) {  
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':' || str.charAt(i) == '@'|| str.charAt(i) == '#'|| str.charAt(i) == '$') {  
	                count++;  
	            }  
	        }  
	        System.out.println("Total number of punctuation : " +count);  
	    

	}

}
