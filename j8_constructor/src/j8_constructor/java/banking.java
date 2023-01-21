package j8_constructor.java;

public class banking {
	int amount;
	int withamt;
	int depoamt;
banking(int amount){
	this.amount=amount;
}
public void bank(int withamt,int depoamt) {
	this.withamt=withamt;
	this.depoamt=depoamt;
}
public int with() {
	int withdraw=amount-withamt;
	System.out.println(withdraw);
	return withdraw;
}
public int depo() {
	int deposite=amount+depoamt;
	return deposite;
}
	public static void main(String[] args) {
		banking obj=new banking(2000);
		obj.bank(200, 500);
		obj.with();
		System.out.println(obj.depo());

	}

}
