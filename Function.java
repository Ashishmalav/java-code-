import java.util.Scanner;

public class Function
{ public static int addtion(int a,int b)
    {   int sum =a+b;
        int mul =a*b;
        return (sum);
    }
    public static int multiplication(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();
        int sum = addtion(a, b);
        //multiplication(a,b);
        System.out.println("sum of the a and b is " + sum);
        System.out.println("the multiplication of the numbers is :"+multiplication(a,b));
     }
   }