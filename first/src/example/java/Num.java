package example.java;

public class Num {
	public static void main(String[] args) {
		//Square Pattern 
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		System.out.println("-----------------------");
		//Continuous Pattern	
			int n=1;
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if (i>=j) {
						System.out.print(n+" ");
						n++;	
					}
					
				}
				System.out.println();
			}
		System.out.println("-----------------------");
		//Character Pattern
		int k=65;		//ascii value of 'A'
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print((char)k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//Hollow Square
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==1 || i==5 || j==5) {
				System.out.print("*"+" ");
				}else {
				System.out.print(" "+" ");	
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//Even number print
		int e=1;
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++) {		
			System.out.print((e%2==0)?e+" ":" "+" ");		
					e++;
				}
				System.out.println();
			}
		System.out.println("-----------------------");
		//Hollow Rectangle Pattern
				for(int i=1;i<=4;i++) {
					for(int j=1;j<=8;j++) {		
						if(i==1 || j==1 || i==4 || j==8) {
							System.out.print("*"+" ");
							}else {
							System.out.print(" "+" ");	
							}
					}
					System.out.println();
				}
			System.out.println("-----------------------");
		}
	}
	



