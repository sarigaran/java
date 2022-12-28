package j5_part1;

import java.util.Iterator;

public class Alphapatical {

	public static void main(String[] args) {
		String temp;
	String name[]= {"hari","enba","balu","seenu","deva","pujee"};
	for (int i = 0; i < name.length; i++) {
		for (int j = i+1; j < name.length; j++) {
			if (name[i].compareTo(name[j])>0) {
				 temp=name[i];
				 name[i]=name[j];
				 name[j]=temp;
				
			}
		}System.out.println(name[i]);
	}


	}

}
