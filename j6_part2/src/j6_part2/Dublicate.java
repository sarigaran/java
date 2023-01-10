package j6_part2;

public class Dublicate {

	public static void main(String[] args) {
		int n[]= {5,2,5,7,4,7,3,7,9};
for(int i = 0; i < n.length; i++) {
	for (int j = 0; j < n.length; j++) {
		if (n[i]!=n[j]) {
			System.out.println(n[j]);
		} else {
System.out.println(n[i]);
		}
	  }
	}
}

}
