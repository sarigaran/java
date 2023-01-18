/*package obj.java;

public class Calculator {
	void add(int a,int b) {
		int c=a+b;
		System.out.println("Add : "+c);
	}
	void dif(int a,int b) {
		int c=a-b;
		System.out.println("Difference : "+c);
	}
	void pro(int a,int b) {
		int c=a*b;
		System.out.println("Product : "+c);
	}
	void quo(int a,int b) {
		int c=a%b;
		System.out.println(	"Quotient : "+c);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		int a=sc.nextInt();
		System.out.println("enter the b value");
		int b=sc.nextInt();
		obj.add(a, b);
		obj.dif(a,b);
		obj.pro(a,b);
		obj.quo(a,b);
	}*/
package obj.java;
public class Calculator {
int num1,num2;
int sum,dif,pro;
public void assign(int num1,int num2){
	this.num1=num1;
	this.num2=num2;
}
	public int sum() {
		sum=num1+num2;
		System.out.println("sum = "+sum);
		return sum;
	}
	public int diff() {
		 dif=num1/num2;
		System.out.println("diff = "+dif);
		return dif;
	}
	public int porduct() {
		 pro=num1*num2;  
		System.out.println("product = "+pro);
		return pro;
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("output :");
		cal.assign(10, 1);
		cal.sum();
		cal.diff();
		cal.porduct();
	}

}
