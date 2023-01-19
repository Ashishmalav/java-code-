import java.util.Scanner;

public class HOMEworkQ
  {
      public static void main(String[]args)
      {
          Scanner SC=new Scanner(System.in);
          System.out.print("enter the value of a :");
          float a= SC.nextFloat();
          System.out.print("enter the value of b :");
           float b= SC.nextFloat();
           float Add=a+b;
           float sub=a-b;
           float mul=a*b;
           float divi=a/b;
           float rem= a%b;
           System.out.println(Add);
          System.out.println(sub);
          System.out.println(mul);
          System.out.println(divi);
          System.out.println(rem);

          
      }
  }
