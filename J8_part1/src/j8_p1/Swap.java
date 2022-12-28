package j8_p1;



public class Swap {
	static int a=20;
	static int b=50;
	int temp;
	
	void meth(){
		temp=a;
		a=b;
		b=temp;
	
	}
	public static void main(String[] args) {
	Swap obj=new Swap();
	obj.meth();
	System.out.println(a);
	System.out.println(b);

	}

}
