package j5_part1;

public class MoveUppercase {

	public static void main(String[] args) {
		String str="SamAlex";
		String upp=" ",low=" ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
				upp=upp+str.charAt(i);
			}
			else if (str.charAt(i)>='a'&&str.charAt(i)<='z') {
				low=low+str.charAt(i);
			}
		}
		
		String res=low+upp;
		System.out.println(res);
		System.out.println(upp);
		System.out.println(low);
	}

}

