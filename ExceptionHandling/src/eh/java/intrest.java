package eh.java;

public class intrest {

	public static void main(String[] args) {
		float p,n,r,si;
		p=12000;
		n=12;
		r=2;
		try {
			si=(p*n*r)/100;
			System.out.println("intrest : "+si);
		}
		catch(Exception e) {
			System.out.println("error" +e);
		}
	}

}
