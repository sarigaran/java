package eh2.java;
import java.util.*;
import java.util.InputMismatchException;
public class age {
	public static void main(String[] args) throws AgeException {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the age : ");
int age=sc.nextInt();
try {
	if(age<18) {
		throw new AgeException("invalid age ") ;
	}
	else {
		System.out.println("valid age : "	);
	}
}
catch(InputMismatchException s) {
	System.out.println("InputMismatchException"+s);
}
catch(AgeException a) {
	System.out.println("AgeException"+a);
}
catch(Exception e){
System.out.println("error"+e);	
}

	}

}
