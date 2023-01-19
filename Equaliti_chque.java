import java.util.Scanner;

public class Equaliti_chque
{  public static void main (String[]args)
     {
         Scanner Sc =new Scanner(System.in);
         System.out.print("enter the value of a ");
         int a=Sc.nextInt();
         System.out.print("enter the value of b ");
         int b=Sc.nextInt();
         System.out.print("enter the value of c ");
         int c=Sc.nextInt();
         if (a>b&&a>c)
         {
             System.out.println("a is the greatest value in a,b,c");
         }
         else if (b>a&&b>c)
         {
             System.out.println("b is the greatest value in a,b,c");
         }
         else if (c>a&&c>b)
         {
             System.out.println("c is the greatest value in a,b,c");
         }
         else
         {
             System.out.println(" can't found");
         }
     }
}
