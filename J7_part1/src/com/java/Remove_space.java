package com.java;

public class Remove_space {

	public static void main(String[] args) {
		String s="java program";
		char sr=' ';
		String rem="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=sr) {
				rem=rem+s.charAt(i);
			}
		}System.out.println(rem);
	}

}
