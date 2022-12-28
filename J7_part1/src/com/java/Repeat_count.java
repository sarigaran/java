package com.java;

public class Repeat_count {
	public static void main(String[] args) {
	 String str = "example";
     char[] charr = str.toCharArray();
     System.out.println("The string is:" + str);
      for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
           if (charr[i] == charr[j]) {
              System.out.print(charr[j] + " ");
              
           }
        }
     }
}
}