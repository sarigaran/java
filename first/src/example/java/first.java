package example.java;

import java.util.Scanner;

public class first {
   public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   System.out.println("enter the number");
int n=sc.nextInt();
System.out.println("how many times");
int m=sc.nextInt();
System.out.println("table");
for (int i = 0; i <=m; i++) {
	System.out.println(i+" * "+n+" = "+n*i);
}
   }}
   



















/*


int i;

for(i=1;i<=4;i++){

    if(i>2){

        break;

      }

}

System.out.println(i);











int sum = 0;

for (int i = 0, j = 0; i < 5 && j < 5; ++i, j = i + 1)

sum += i;

System.out.println(sum);









int n1=0,n2=1,n3,i,count=10;    
System.out.print(n1+" "+n2);//printing 0 and 1    
   
for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
{    
 n3=n1+n2;    
 System.out.print(" "+n3);    
 n1=n2;    
 n2=n3;    
}    
 
   
   */