package j8_p1;

class ex{
	 public int r=1;
	 
     double meth(){
    	 double area=3.14*r*r;
    	 return area;
     }
     double meth2(){
    	 double peri=2*3.14*r;
    	 return peri;
     }
    
}
 
public class example {

	public static void main(String[] args) {
		ex obj=new ex();
		System.out.println(obj.meth());
		System.out.println(obj.meth2());
	}

}
