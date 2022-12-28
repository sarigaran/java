package alpha_printing;

public class R {

	public static void main(String[] args) {
		int i,j;
		
		for ( i = 1; i <=7; i++) {
			for (j = 1; j <=5; j++) {
				int k=i+j;
				if (i==1&&i+j!=6||j==1||i==4&&i+j!=9||i<=3&&j==5&&i+j!=6
						||i>=5&&j>=5) {
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
				
			}System.out.println();

	}
	}//||i+j>=8&&k%2==0
}
