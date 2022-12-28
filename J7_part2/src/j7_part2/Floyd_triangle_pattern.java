package j7_part2;

public class Floyd_triangle_pattern {

	public static void main(String[] args) {
		int c=1;
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j<=3; j++) {
				if (i>=j) {
					System.out.print(c +"  ");
					c++;
				}
			}
			System.out.println("  "+"  ");
		}

	}

}
