package j09_p21_inheritance;

public class current {
	double tamount;
	public current(int tamount) {
		this.tamount=tamount;	
	}
	public void deposite(int amount) {
		tamount=tamount+amount;
		System.out.println("deposite : "+tamount);
	}
	public void withdraw(int amount) {
		
		tamount=tamount-amount;
		System.out.println("withdraw : "+tamount);
	}}
	

	