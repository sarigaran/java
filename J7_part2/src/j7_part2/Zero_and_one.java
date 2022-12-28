package j7_part2;

public class Zero_and_one {

	public static void main(String[] args) {
		
		for (int i = 0; i <6; i++) {
			for (int j = 0; j < i; j++) {
				
			if (j%2==0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}	
			}System.out.println();
		}
	}

}
