package com.java;

public class non_repeat {

	public static void main(String[] args) {
		 String s = "array";
		for (int i = 0; i < s.length(); i++) {
		      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
		        System.out.println("character is "+ s.charAt(i));
		        break;
		      }
		    }
		  }
	}


