package alpha_printing;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Triangle Pattern 
				for(int i=1;i<=3;i++) {
					for(int j=1;j<=3;j++) {
						if(i>=j) {
						System.out.print("*"+" ");
						}
					}
					System.out.println();
				}
		System.out.println("-----------------------");
				//Triangle Pattern (Reverse) 
				for(int i=1;i<=3;i++) {
					for(int j=1;j<=3;j++) {
						if(i<=j) {
						System.out.print("*"+" ");
						}
					}
					System.out.println();
				}
		System.out.println("-----------------------");
		//Triangle Pattern 
				for(int i=1;i<=3;i++) {
					for(int j=3;j>=1;j--) {
						if(i>=j) {
						System.out.print("* "); //space for pyramid
						}else {
						System.out.print(" ");	
						}
					}
					System.out.println();
				}
				System.out.println("-----------------------");
				//Triangle Pattern (Reverse) 
				for(int i=3;i>=1;i--) {
					for(int j=3;j>=1;j--) {
						if(i>=j) {
						System.out.print("* ");
						}else {
						System.out.print(" ");	
						}
					}
					System.out.println();
				}
		System.out.println("-----------------------");
			}

	
		}


