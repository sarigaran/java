package Collection.java;
import java.util.*;
public class AL {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
al.add("hari");
al.add("siva");
al.add("pujee");
al.add("hari");

Scanner st=new Scanner(System.in);
System.out.println("enter the name");


for (int i = 0; i < 5; i++) {
	String s1=st.next();
	al.add(s1);
}
System.out.println(al);
System.out.println((al.contains("zxcv"))?"found":"not found");
	}


	}


