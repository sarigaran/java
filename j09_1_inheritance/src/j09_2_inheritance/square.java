package j09_2_inheritance;

public class square extends rectangle {

	square(int dim1, int dim2) {
		super(dim1, dim2);
		System.out.println("square");
	}
public void areasquare() {
	System.out.println("area of the square : "+dim1*dim2);
}
public void perisquare() {
	System.out.println("perimeter of the square : "+2*(dim1+dim2));
}

}
