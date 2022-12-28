package obj.java;

public class Student {

	int total(int[]marks) {
		int sum=0;
		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];
		}
		return sum;
	}
	int avg(int total,int sub) {
		return total/sub;
	}
	public static void main(String[] args) {
		int m[]= {10,30,56,24,65,67};
		int s=m.length;
		Student res=new Student();
		int tot=res.total(m);
		System.out.println("Total : "+tot);
		float ave=res.avg(tot, s);
		System.out.println("Average : "+ave);
		
		
	}

}
