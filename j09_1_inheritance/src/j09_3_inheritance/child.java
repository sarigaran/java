package j09_3_inheritance;
public class child extends parent{
	public child() {
		System.out.println("child");
	}
	public void display() {
		System.out.println("this is the child cleass");
	}
public static void main(String[] args) {
	child ch=new child();
	
	ch.display();
	ch.pdisplay();
	parent p=new parent();
	p.pdisplay();
}
}
