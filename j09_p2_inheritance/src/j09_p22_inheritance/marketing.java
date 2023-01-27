package j09_p22_inheritance;

public class marketing extends employee {

	marketing(int id, String name, String dept, double salary) {
		super(id, name, dept, salary);
	}
	void mdisplay() {
		double amount=salary+2000;
		System.out.println("marketing employee salary : "+amount);
	}

}
