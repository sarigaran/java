package override.java;
public class main {
	public static void main(String[] args) {
		bank b=new bank(1.4f);
		b.intrest();
		System.out.println("----------  ***  ----------");
		sbi sbi=new sbi(3.4f);
		sbi.intrest();
		System.out.println("----------  ***  ----------");
		icici ic=new icici(5.4f);
		ic.intrest();
		System.out.println("----------  ***  ----------");
	}
}
