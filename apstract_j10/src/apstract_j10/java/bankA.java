package apstract_j10.java;

public class bankA extends bank {
	int amt;
	 bankA(int amt){
		 this.amt=amt;
	 }
   void getBalance() {
	   this.amount=this.amount+amt;
	   System.out.println("deposited "+amount);
   }
}
