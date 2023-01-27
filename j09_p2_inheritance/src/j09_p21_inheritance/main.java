package j09_p21_inheritance;
public class main {
	public static void main(String[] args) {
	System.out.println("current account");
			saving cur=new saving(5000);
		     cur.deposite(300);
		     cur.withdraw(30);
		     System.out.println("saving account");
		    cur.deposite(500);
		    cur.withdraw(100);
		    cur.intrest(10);
		}}
