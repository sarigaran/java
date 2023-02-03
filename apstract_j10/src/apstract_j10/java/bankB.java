package apstract_j10.java;

public class bankB extends bank {
	int amt;
	bankB(int amt){
		this.amt=amt;
	}
	  void getBalance() {
		  this.amount=this.amount+amt;
	System.out.println("deposited "+amount);
	   }

}
