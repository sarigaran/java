package org.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String fname="/home/arigaran/html/balaji.txt";
			FileReader fr=new FileReader(fname);
			String data="";
			
			int i;
			while((i=fr.read())!=-1) {
				data=data+(char)i;
			}
			System.out.println("no of character :"+data.length());
			System.out.println(data);
			fr.close();
			}
			catch(IOException e){
				System.out.println("error"+e);
			}
		}


		
	}


