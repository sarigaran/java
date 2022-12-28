package j4_part2;
public class Equal {
	public static void main(String[] args) {
		int[][] x = {{1, 2}, {3, 4}};
		int[][] y = {{1, 2}, {3, 6}};
		int equal = 1;
		for(int i = 0; i < x.length; i++){
			for( int j = 0; j < x[0].length; j++){
				if(x[i][j] != y[i][j]) {
				equal = 1;	
				}
			}
		}
		if(equal == 0) {
			System.out.println("x is equal to y");
		}
		else {
			System.out.println("x is not equal to y");
		}
	}
}
