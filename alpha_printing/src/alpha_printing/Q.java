package alpha_printing;

public class Q {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i==1&&i+j!=2&&i+j!=6||j==1&&i+j!=2
						&&i+j!=6||i==5&&i+j!=6&&i+j!=10||j==5&&i+j!=6||i+j==8) {
					
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" ");
				}
			}System.out.println();
		}

	}

}
