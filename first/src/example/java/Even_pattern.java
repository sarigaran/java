package example.java;

public class Even_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Even number print
		int e=1;
			for(int i=1;i<=6;i++) {
				for(int j=1;j<=6;j++) {		
			System.out.print((e%2==0)?e+"  ":"  ");		
					e++;
				}
				System.out.println();
			}
	}

}
