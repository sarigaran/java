package org.java;
import java.io.IOException;
import java.io.FileWriter;
public class Writter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
		String fw="/home/arigaran/html/balaji.txt";
		FileWriter fw=new FileWriter("/home/arigaran/html/balaji.txt");
		fw.write("hello world");
		
		
	}
	catch(IOException e){
		
		System.out.println("error"+e);
	}

	}

}
