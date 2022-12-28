package j6_part2;

public class Pairs {

	public static void main(String[] args) {
		int a[]= {2,3,6,7,5,1};
		int n=9;
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if (a[i]+a[j]==n&&a[i]<=a[j]) {
			
			System.out.println("the pairs numbers are a : "+a[i]+" "+a[j]);
		
		
		}
	}System.out.println();
}
	}

}
