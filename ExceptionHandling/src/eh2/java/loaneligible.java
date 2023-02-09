package eh2.java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class loaneligible {
	public static void main(String[] args) throws AgeException {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the age : ");
int age=sc.nextInt();
System.out.println("enter the location");
String str=sc.next();
try {
	if(age<23) {	
		if(str=="madurai"){
			throw new AgeException("not eligible" );
			}}
	else {
		System.out.println("you are eligible to get a loan "	);}
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
