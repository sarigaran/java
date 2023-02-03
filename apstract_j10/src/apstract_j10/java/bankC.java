package apstract_j10.java;

public class bankC extends bank{
	int amt;
	bankC(int amt){
		this.amt=amt;
	}
	  void getBalance() {
	this.amount=this.amount+amt;
    System.out.println("deposited "+amount);
	   }
}
