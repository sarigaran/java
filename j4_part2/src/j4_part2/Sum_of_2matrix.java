package j4_part2;

public class Sum_of_2matrix {
public static void main(String[] args) {
	int array1[][]= {{8,8,9},{5,6,7},{7,5,6}};
	int array2[][]= {{2,3,4},{5,6,7},{4,5,6}};
	int array3[][]= new int[3][3];
	
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array2.length; j++) {
			array3[i][j]=array1[i][j]+array2[i][j];
					System.out.print(array3[i][j]+"   ");
					
		}
		System.out.println();
	}
}
}
