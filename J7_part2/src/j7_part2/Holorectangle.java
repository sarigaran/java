package j7_part2;

public class Holorectangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++) {
			for (int j = 1; j <=9; j++) {
				if (i==1||j==1||j==9||i==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
			

	}

}
