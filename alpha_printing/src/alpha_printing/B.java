package alpha_printing;

public class B {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <=6 ; j++) {
	if (i==1&&i+j!=7||j==1||i==7&&i+j!=7&&i+j!=13||j==6&&i+j!=7&&i+j!=13||i==4)
	   {
		System.out.print("*"+" ");
		}	
			else {
		System.out.print(" "+" ");
				 }		
		}System.out.println();
		 }
		
	}

}
