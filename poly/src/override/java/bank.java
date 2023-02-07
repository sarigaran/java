package override.java;

public class bank {
	int p=5000,n=1;
	float i,r;
bank(float r){
	this.r=r;
}
	public void intrest() {
		 i=(p*n*r)/100;
		System.out.println("bank intrest : " + i);
	}
}

