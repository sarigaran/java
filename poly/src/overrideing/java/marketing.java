package overrideing.java;
public class marketing extends employee {
	int insen=2000;
	int tsal;
marketing(int id, String name, int salary) {
		super(id, name, salary);
		System.out.println("emp id : "+id);
		System.out.println("emp name : "+name);
		System.out.println("emp basic salary : "+salary);
		tsal=salary+insen;
		System.out.println("total salary : "+tsal);
	}
}
