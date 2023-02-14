package employee.java;
class emplyeedetails{
	int id;
	String name;
	float salary;
	String destination;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public emplyeedetails(int id, String name, float salary, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.destination = destination;
	}
	
}
public class Employee {
public static void main(String[] args) {
	emplyeedetails obj= new emplyeedetails(101,"Arigaran", 20000, "chennai");
	System.out.println(obj.id);
	System.out.println(obj.name);
	System.out.println(obj.salary);
	System.out.println(obj.destination);
}
}
