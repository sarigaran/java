
package alpha_printing;

public class C {

	public static void main(String[] args) {
		for (int i = 1; i<=6; i++) {
			for (int j = 1; j<=6; j++) {
				if (i==1&&i+j!=2||j==1&&i+j!=2&&i+j!=7||i==6&&i+j!=7) {
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" " );
				}
			}System.out.println();
		}
	}

}
