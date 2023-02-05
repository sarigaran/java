package interface1.java;

public class Employee implements orgRules{

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.attendOffice();
		emp.attendOffice();
		emp.applyLeave();
		

	}

	public void attendOffice() {
System.out.println("atttend office");
		
	}
	public void applyLeave() {
		System.out.println("apply leave");		
	}

	public void providesalary() {
		System.out.println("grtting salary");
		
	}

}
