package j09_p21_inheritance;
public class saving extends current{
	public saving(int tamount) {
		super(tamount);
	}
	public void deposite(int amount) {
		tamount=tamount+amount;
		System.out.println("deposite : "+tamount);
	}
	public void withdraw(int amount) {	
		tamount=tamount-amount;
		System.out.println("withdraw : "+tamount);
	}
	public void intrest(double intrest) {
		tamount=tamount+intrest;
		System.out.println("deposite : "+tamount);
	}}
