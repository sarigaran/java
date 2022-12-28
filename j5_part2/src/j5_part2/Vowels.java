package j5_part2;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
String str="";
int m = 0;
int c=0;
for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&
			s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U') {
		str+=s.charAt(i);
		c++;
	} 
	 m=s.length()-c;
	}System.out.println(""+str);
System.out.println("Number of non vowels :"+c);
System.out.println("number of vowels : "+m);

	}

}

