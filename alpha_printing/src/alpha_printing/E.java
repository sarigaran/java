package alpha_printing;

public class E {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=6; j++) {
				if (i==1||j==1||i==4||i==7) {
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" ");
				}
			}System.out.println();
		}
	}

}
