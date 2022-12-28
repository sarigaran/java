package j4_part2;

public class Transpose2 {

	public static void main(String[] args) {
		int array[][]= {{2,3,4},{5,4,6},{3,5,6}};
		System.out.println("original");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}

}
