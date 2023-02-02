package apstract_j10_2.java;

public class Student2 extends Mark{
	int mark1,mark2,mark3,mark4;
	float percentage;
   Student2(int mark1,int mark2,int mark3,int mark4){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}
	void getPercentage() {
		 percentage=(mark1+mark2+mark3+mark4)/4;
		System.out.println("percentage of student 2 : "+percentage);
	}


}
