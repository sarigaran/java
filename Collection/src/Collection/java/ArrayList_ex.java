package Collection.java;
import java.util.*;
public class ArrayList_ex {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("magesh");
		al.add("magesh");
		al.add("naveenesh");
		al.add("hari");
		al.add("nashiya");
		al.add("rithika");
		al.add("pooja");
		al.add("shiva");
		al.add(5, "srini");
		System.out.println(al);
		al.remove(7);
		al.remove(6);
		System.out.println(al);
		int s=al.size();
		for (int i = 0; i <s; i++) {
			System.out.println(al.get(i));
		}
		System.out.println((al.contains("naveenesh"))?"\n found" :"\n not found");
		System.out.println((al.contains("tamana"))?"\n found" :"\n not found");
		
	
	}

}
