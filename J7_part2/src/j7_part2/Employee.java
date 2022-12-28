package j7_part2;

public class Employee {
			public  int id=2004;
			
			{
				System.out.println(id);
			}
			public	String name="hari";{
				System.out.println(name);
			}
			public int salary = 2000;
			{
				System.out.println(salary);
			}
			public String dep="CSE";
			{
				System.out.println(dep);
			}
	public static void main(String[] args) {
		Employee obj=new Employee();
		int id=obj.id;
		String name=obj.name;
		int salary=obj.salary;
		String dep=obj.dep;
}
}
