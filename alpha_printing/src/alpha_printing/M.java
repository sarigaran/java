package alpha_printing;

public class M {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j<=7; j++) {
				if (j==1||j==7||i==j&&i<=4||i+j==8&&j>=4) {
					System.out.print("*"+" ");
				} else {
System.out.print(" "+" ");
				}
			}System.out.println();
		}
	}

}


