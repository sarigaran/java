package apstract_j10.java;

public class main {

	public static void main(String[] args) {
		bank ba;
		ba=new bankA(100);
		ba.getBalance();
		ba=new bankB(200);
		ba.getBalance();
	    ba=new bankC(300);
        ba.getBalance();
	}

}
