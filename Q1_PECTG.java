import java.util.Scanner;
public class Q1_PECTG
{ public static void main(String[]args)
   {
       System.out.println("programe to find the percentage ");
       Scanner sc = new Scanner(System.in);
       float total=500;
       System.out.print("enter the name of the student:");
       String Name=sc.next();
       System.out.println(Name);
       System.out.print("enter the marks in maths:");
       float maths= sc.nextFloat();
       System.out.print("enter the marks in phy:");
       float phy= sc.nextFloat();
       System.out.print("enter the marks in chem:");
       float chem= sc.nextFloat();
       System.out.print("enter the marks in english:");
       float english= sc.nextFloat();
       System.out.print("enter the marks in hindi :");
       float hindi= sc.nextFloat();
       float sum =(maths+phy+chem+hindi+english);
       float pect= ( sum/total)*100;
       System.out.print("the percentage of "+ Name + " is:");
       System.out.print(pect);

   }
}
