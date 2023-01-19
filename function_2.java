import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class function_2
// static int multiplication(int a,int b)
//    {
//     int mul= a*b;
//     return mul;
//    }
//    public static void main(String[] args)
//    {
//        Scanner mc= new Scanner(System.in);
//        System.out.print("enter the value of a:");
//        int a= mc.nextInt();
//        System.out.print("enter the value of b:");
//        int b=mc.nextInt();
//        int mul= multiplication(a,b);
//        System.out.println("multiplication of a & b is : "+mul);
// code with hary methods explainnation
{
    static int logic(int x,int y) {
          int z;
          if (x > y) {
              z = x + y;
          } else {
              z = (x + y)*5;
          }
          return z;
      }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a :");
        int a =sc.nextInt();
        System.out.print("enter the value of b :");
        int b= sc.nextInt();
        int c=logic(a,b);
        System.out.println(c);
//???@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?@?
 // method  overlading//

  }
}
