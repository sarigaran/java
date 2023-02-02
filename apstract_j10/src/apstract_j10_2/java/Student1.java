package apstract_j10_2.java;

public class Student1 extends Mark{
	int mark1,mark2,mark3;
	float percentage;
	Student1(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void getPercentage() {
		 percentage=(mark1+mark2+mark3)/3;
		System.out.println("percentage of student 1 : "+percentage);
	}

}
