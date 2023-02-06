package getset.java;

public class accountholder {

	public static void main(String[] args) {
	
		Bank bb=new Bank();
		int min= bb.getMinimumbalance();
		System.out.println(min);
		bb.setMinimumbalance(3000);
		min=bb.getMinimumbalance();
		System.out.println(min);

	}

	
}
