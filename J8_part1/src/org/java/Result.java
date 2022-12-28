package org.java;

public class Result {
	int total(int[] marks) {
		int sum=0;
		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];
		}
		return sum;
	}
	float avg(int total,int sub)
	{
		return total/sub;
	}
	public static void main(String[] args) {
	int m[]= {46,68,89,57,79};		
	int s=m.length;
	Result res=new Result();
	int tot=res.total(m);
	System.out.println("Total : "+tot);
	float average=res.avg(tot, s);
	System.out.println("Average : "+average);
	}

}
