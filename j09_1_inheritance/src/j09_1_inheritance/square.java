package j09_1_inheritance;

public class square extends rectangle{
	void sdisplay() {
		System.out.println("square is a rectangle");
	}
	public static void main(String[] args) {
		square sq=new square();
		sq.sdisplay();
		sq.rdisplay();
		sq.display();
		
	}
	
}
