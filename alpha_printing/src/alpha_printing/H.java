package alpha_printing;

public class H {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j<=5; j++) {
				if (i==4||j==1||j==5) {
					System.out.print("*"+" ");
				} else {
System.out.print(" "+" ");
				}
			}System.out.println();
		}
	}

}
