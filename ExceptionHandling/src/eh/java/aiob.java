package eh.java;

public class aiob {

	public static void main(String[] args) {
		try {
		int num[]=new int[10];
		num[10]=30/0;
		num[11]=30/9;
		}
		catch (ArrayIndexOutOfBoundsException
	               | ArithmeticException e) {
	            System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error "+e);
		}
		System.out.println("end");

	}

}
