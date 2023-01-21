package j8_constructor.java;

public class constructor {
	int num1;
	int num2;
	constructor(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
	}
public int quotient() {
	int quo=num1/num2;
	return quo;
}

public int reminter() {
	int rem=num1%num2;
	return rem;
}

	public static void main(String[] args) {
		constructor obj=new constructor(11,2);
		System.out.println( obj.quotient());
        System.out.println(obj.reminter());
         
	}

}
