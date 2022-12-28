package alpha_printing;

public class P {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=5; j++) {
				if (i==1&&i+j!=6||j==1||i==4&&i+j!=9||i<=3&&j==5&&i+j!=6) {
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
				
			}System.out.println();
		}
	}

}
