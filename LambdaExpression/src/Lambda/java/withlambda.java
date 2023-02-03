package Lambda.java;

	interface A{
		void m();
   }
	
	class B implements A{
	public void m() {
		System.out.println("hello M");
	}
}



public class withlambda {
	public static void main(String[] args) {
		B obj=new B();
		obj.m();
		
	}
}
