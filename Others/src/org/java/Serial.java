package org.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {

     
	public static void main(String[] args) {
	       
	    Student st=new Student(101,"25-Jan",95.2F);    
	   
	    try {
	   FileOutputStream fos=new FileOutputStream("Data.ser");  
	   ObjectOutputStream oop=new ObjectOutputStream(fos);
	   oop.writeObject(st);
	   System.out.println("serial");
	   oop.close();
	       
	    }catch(Exception e) {
	        System.out.println("Error in Serializing");
	    }
	   
	    }

	}



