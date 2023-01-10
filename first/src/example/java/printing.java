package example.java;

public class printing {
int rem=0;
int sum=0;
int i=121;
	public void repeat() {
			while(i > 0)  
			{  
			rem = i % 10;  
			sum = sum + rem;  
			i = i / 10;  
			}  
			System.out.println("Sum of Digits: "+sum);  	
		}
	
	public static void main(String[] args) {
		printing prt=new printing();
		prt.repeat();
	}

}
