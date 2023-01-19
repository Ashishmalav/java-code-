//for loop programe  for reverce numbers
import java .util.Scanner;
public class Loops
{ public static void main(String [] args)
   {
     Scanner SC =new Scanner(System.in);
       System.out.println("programe for FOR LOOP");
       System.out.print("enter the value of n :");
        int n=SC.nextInt();
        int i;
        for(i=0;i<10;i++)
     {
         System.out.println(i);
     }
       for(i=n;i>0;i--)
       {
           System.out.println(i);
       }
      // PROGRAME FOR WHILE LOOP
       while (n<10)
       {
           System.out.println(n);
           n++;
       }

   }
}
