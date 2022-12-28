package j8_p1;

class mark {
	
	
	  
	public int total(){
		int sub1=45;
		int sub2=45;
		int sub3=45;
		int sub4=45;
		int sub5=45;
		int total=0;
		int total +=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total mark is "+total);
		return total;
		}
	public int average(){	
		int sub=5;
		int aver= tot/sub;
		System.out.println("average "+aver);
		return aver;
		}
}

public class student {
	
	public static void main(String[] args) {
		mark obj=new mark();
		
		obj.average();
		
			}
}





