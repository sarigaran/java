package j09_2_inheritance;

public class rectangle {
	int dim1,dim2;
	rectangle(int dim1,int dim2) {
		this.dim1=dim1;
		this.dim2=dim2;
		System.out.println("rectangle :");
	}
	public void rectarea() {
		System.out.println("area of the rectangle : "+dim1*dim2);
	}
	public void rectperi() {
		System.out.println("perimeter of the rectangle : "+2*(dim1+dim2));
	}
}
