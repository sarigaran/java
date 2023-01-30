package stack_01;

public class stackmain {

	public static void main(String[] args) {
		stack stk=new stack();
		stk.push(8);
		stk.push(2);
		stk.push(4);
		stk.push(9);
		stk.push(8);
		stk.push(2);
		stk.push(4);
		stk.push(9);
		System.out.println("number of datas : "+stk);
		System.out.println("number of datas : "+stk.tos);
		
		stk.pop();
		

	}

}
