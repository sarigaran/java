package j7_part2;

public class Dimaond {
	public static void main(String[] args) {
	
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j<=3; j++) {
				if (i>=j) {
					System.out.print(" *");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}


