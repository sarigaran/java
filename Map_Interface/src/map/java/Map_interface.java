package map.java;
import java.util.TreeMap;
import java.util.*;
public class Map_interface {

	public static void main(String[] args) {
		TreeMap<String,String> tm1=new TreeMap<String,String>();    
        tm1.put("India","New Delhi");
        tm1.put("America","Washington DC");
        TreeMap<String,String> tm2=new TreeMap<String,String>();    
        tm2.put("Australia","Canberra");
        tm2.put("Mexico","Mexico");    
       
        tm1.putAll(tm2);
        System.out.println(tm1);
        System.out.println(tm2);
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Country Name : ");
        String n=sc.next();
        if(tm1.containsKey(n)) {
            System.out.println("Capital is "+tm1.get(n));
        }else {
            System.out.println("Not found");
        }

	}

}
