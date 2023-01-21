package j8_constructor.java;

public class welcome {
	String name;
	int a;
	int b;
	int c;
	
    welcome(String name) {
		this.name=name;
		System.out.println("welcome " + name);
	}	
    welcome()
    {
    	System.out.println("welcome gust");
    }
public int sum(int k1,int k2){
	int sum=k1+k2;
	System.out.println(sum);
	return sum;
	}
public static void main(String[] args) {
		welcome obj1=new welcome("hari");
		welcome obj2=new welcome();
	
		obj1.sum(2, 3);
		obj2.sum(4, 6);
	}

}
