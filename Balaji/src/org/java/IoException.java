package org.java;

import java.io.FileReader;
import java.io.IOException;

public class IoException extends Exception {

	
	public static void main(String[] args) throws IOException {
		String fname="/home/arigaran/html/balaji.txt";
		FileReader fr=new FileReader(fname);
		String data="";
		int i;
		while((i=fr.read())!=-1) {
			data=data+(char)i;
		}
		System.out.println("no of character :"+data.length());
		System.out.println(data);
	}

}



















try {
	String fname="/home/arigaran/html/balaji.txt";
	FileWritter fr=new FileWritter(fname);
	String data="";
	int i;
	while((i=fr.write())!=-1) {
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

}
