package map.java;
import java.util.*;
public class TreeMap_ex {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>(); 
        tm.put("INDIA","DELHI");
        tm.put("ARMENIA","YEREVAN");
        TreeMap<String,String> tm1=new TreeMap<String,String>();
        tm1.put("CHINA", "BEIJING");
        tm1.put("CUBA", "HAVANA");
        tm.putAll(tm1);
        System.out.println(tm);
        System.out.println(tm1);
        try {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.next();
        if(tm.containsKey(name)) {
        	System.out.println(tm.get(name));	
        }
        else {
        	System.out.println("not found");
        }
        }
        catch(Exception e){
        	System.out.println("error"+e);
        }
        
	}

}
