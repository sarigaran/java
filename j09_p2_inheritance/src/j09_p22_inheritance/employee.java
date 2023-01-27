package j09_p22_inheritance;
public class employee {
	int id;
	String name;
	String dept;
	double salary;
employee(int id,String name,String dept,double salary){
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}
void display() {
	System.out.println("employee id : "+id);
	System.out.println("employee name : "+name);
	System.out.println("employee dept : "+dept);
	System.out.println("employee salary"+salary);
}}
