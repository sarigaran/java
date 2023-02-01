package enumerate.java;
import java.util.Vector;
import java.util.*;
public class Enumerate {

	public static void main(String[] args) {
		Vector<String> vt=new Vector<String>();
		vt.add("hello");
		vt.add("world");
		vt.add("this ");
		vt.add("is java");
		Enumeration<String> enu=vt.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
	}

}
