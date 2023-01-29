package stack_01;

public class stack {
	int arr[]=new int[9];
	int tos;
	
	
stack(){
	tos=-1;
}


void push(int item) {
	if(tos==9) {
		System.out.println("memory is full");
	}
	else {
		tos=tos+1;
		arr[tos]=item;
	}
	}
	int pop() {
		if(tos>=0) {
			int a=arr[tos--];
			System.out.println("pop element : "+a);
			return a;
			
		}
		else {
			
			System.out.println("----stack is empty ---");
			return -1;
			
		}

	
}

}
