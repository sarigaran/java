package alpha_printing;

public class V {

	 public static void main(String args[])

	    {
	        int i, j;
	        for (i =5; i >= 0; i--)   {
         for (j =5; j > i; j--)
         {
             System.out.print(" ");
         }

         System.out.print(("* "));
         for (j = 1; j < (i * 2); j++)
             System.out.print(" ");

         if (i >= 1)
             System.out.print("* ");
         System.out.println(" ");
     }
 }
}